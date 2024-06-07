package dario.gmori.webpageapi.spotify.mappers;

import dario.gmori.webpageapi.spotify.SpotifyUser;
import dario.gmori.webpageapi.spotify.dto.SpotifyUserResponseDto;
import dario.gmori.webpageapi.spotify.songs.mappers.SpotifySongResponseDtoMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.function.Function;

@Service
@RequiredArgsConstructor
public class SpotifyUserResponseDtoMapper implements Function<SpotifyUser, SpotifyUserResponseDto> {
    private final SpotifySongResponseDtoMapper spotifySongResponseDtoMapper;
    @Override
    public SpotifyUserResponseDto apply(SpotifyUser spotifyUser) {
        return SpotifyUserResponseDto.builder()
                .avatar(spotifyUser.getAvatar())
                .profileUrl(spotifyUser.getProfileUrl())
                .username(spotifyUser.getUsername())
                .topSongs(spotifyUser.getTopSongs().stream().map(spotifySongResponseDtoMapper).toList())
                .build();
    }
}
