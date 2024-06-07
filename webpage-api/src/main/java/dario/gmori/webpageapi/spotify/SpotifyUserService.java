package dario.gmori.webpageapi.spotify;

import dario.gmori.webpageapi.common.requests.spotify.SpotifyRequestUtils;
import dario.gmori.webpageapi.spotify.artists.ArtistRepository;
import dario.gmori.webpageapi.spotify.dto.SpotifyUserResponseDto;
import dario.gmori.webpageapi.spotify.mappers.SpotifyUserJsonModelMapper;
import dario.gmori.webpageapi.spotify.mappers.SpotifyUserResponseDtoMapper;
import dario.gmori.webpageapi.spotify.songs.Song;
import dario.gmori.webpageapi.spotify.songs.SongRepository;
import dario.gmori.webpageapi.spotify.songs.mappers.SpotifySongsJsonModelMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class SpotifyUserService {

    private final SpotifyUserRepository spotifyUserRepository;
    private final SongRepository songRepository;
    private final ArtistRepository artistRepository;
    private final SpotifyUserResponseDtoMapper spotifyUserResponseDtoMapper;
    private final SpotifyUserJsonModelMapper spotifyUserJsonModelMapper;
    private final SpotifySongsJsonModelMapper spotifySongsJsonModelMapper;

    private final SpotifyRequestUtils spotifyRequestUtils;
    public SpotifyUserResponseDto getSpotifyInfo() {
        SpotifyUser spotifyUser = updateSpotifyUser(spotifyUserRepository.findUserInfo());
        return spotifyUserResponseDtoMapper.apply(spotifyUser);
    }

    private SpotifyUser updateSpotifyUser(Optional<SpotifyUser> spotifyUser) {
        if(spotifyUser.isEmpty() ){ // No user found, create a new one
            SpotifyUser newSpotifyUser = spotifyUserJsonModelMapper.apply(spotifyRequestUtils.getSpotifyInformation());
            List<Song> songsList = spotifySongsJsonModelMapper.apply(spotifyRequestUtils.getSpotifySongs());
            newSpotifyUser.setTopSongs(saveSongsNotRepeated(songsList));
            newSpotifyUser.setId(1L);
            newSpotifyUser.setLastModifiedDate(LocalDateTime.now());
            return spotifyUserRepository.save(newSpotifyUser);
        } else if(spotifyUser.get().timeToRefreshPassed(10)) { // User found, but it's time to refresh
            SpotifyUser updatedSpotifyUser =  spotifyUser.get();
            List<Song> songsList = spotifySongsJsonModelMapper.apply(spotifyRequestUtils.getSpotifySongs());
            updatedSpotifyUser.updateUser(spotifyUserJsonModelMapper.apply(spotifyRequestUtils.getSpotifyInformation()),saveSongsNotRepeated(songsList));
            return spotifyUserRepository.save(updatedSpotifyUser);
        }else{
            return spotifyUser.get();
        }
    }

    private List<Song> saveSongsNotRepeated(List<Song> songsList) {
        artistRepository.saveAll(songsList.stream()
                .flatMap(song -> song.getArtists().stream())
                .distinct()// Remove duplicates
                .filter(artist -> artistRepository.findByName(artist.getName()).isEmpty())
                .toList()
        );

        return songRepository.saveAll(songsList.stream()
                .filter(song -> songRepository.findBySongId(song.getSongId()).isEmpty())
                .collect(Collectors.toList()));
    }
}
