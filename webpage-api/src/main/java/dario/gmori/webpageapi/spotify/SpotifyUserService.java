package dario.gmori.webpageapi.spotify;

import dario.gmori.webpageapi.common.requests.spotify.SpotifyRequestUtils;
import dario.gmori.webpageapi.spotify.dto.SpotifyUserResponseDto;
import dario.gmori.webpageapi.spotify.mappers.SpotifyUserJsonModelMapper;
import dario.gmori.webpageapi.spotify.mappers.SpotifyUserResponseDtoMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class SpotifyUserService {

    private final SpotifyUserRepository spotifyUserRepository;
    private final SpotifyUserResponseDtoMapper spotifyUserResponseDtoMapper;
    private final SpotifyUserJsonModelMapper spotifyUserJsonModelMapper;

    private final SpotifyRequestUtils spotifyRequestUtils;
    public SpotifyUserResponseDto getSpotifyInfo() {
        SpotifyUser spotifyUser = updateSpotifyUser(spotifyUserRepository.findUserInfo());
        return spotifyUserResponseDtoMapper.apply(spotifyUser);
    }

    private SpotifyUser updateSpotifyUser(Optional<SpotifyUser> spotifyUser) {
        if(spotifyUser.isEmpty() ){ // No user found, create a new one
            SpotifyUser newSpotifyUser = spotifyUserJsonModelMapper.apply(spotifyRequestUtils.getSpotifyInformation());
            newSpotifyUser.setLastModifiedDate(LocalDateTime.now());
            return spotifyUserRepository.save(newSpotifyUser);
        } else if(spotifyUser.get().timeToRefreshPassed(10)) { // User found, but it's time to refresh
            SpotifyUser updatedSpotifyUser = spotifyUserJsonModelMapper.apply(spotifyRequestUtils.getSpotifyInformation());
            spotifyUser.get().setLastModifiedDate(LocalDateTime.now());
            return spotifyUserRepository.save(updatedSpotifyUser);
        }else{
            return spotifyUser.get();
        }
    }
}
