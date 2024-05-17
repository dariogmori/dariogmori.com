package dario.gmori.webpageapi.spotify.dto;

import dario.gmori.webpageapi.spotify.SpotifyUser;
import org.springframework.stereotype.Service;

import java.util.function.Function;

@Service
public class SpotifyUserResponseDtoMapper implements Function<SpotifyUser, SpotifyUserResponseDto> {
    @Override
    public SpotifyUserResponseDto apply(SpotifyUser spotifyUser) {
        return new SpotifyUserResponseDto(
                spotifyUser.getUsername(),
                spotifyUser.getAvatar(),
                spotifyUser.getProfileUrl()
        );
    }
}
