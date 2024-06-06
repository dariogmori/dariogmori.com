package dario.gmori.webpageapi.spotify.mappers;

import dario.gmori.webpageapi.spotify.SpotifyUser;
import dario.gmori.webpageapi.spotify.dto.SpotifyUserResponseDto;
import org.springframework.stereotype.Service;

import java.util.function.Function;

@Service
public class SpotifyUserResponseDtoMapper implements Function<SpotifyUser, SpotifyUserResponseDto> {
    @Override
    public SpotifyUserResponseDto apply(SpotifyUser spotifyUser) {
        return SpotifyUserResponseDto.builder()
                .avatar(spotifyUser.getAvatar())
                .profileUrl(spotifyUser.getProfileUrl())
                .username(spotifyUser.getUsername())
                .build();
    }
}
