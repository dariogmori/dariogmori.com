package dario.gmori.webpageapi.spotify;

import dario.gmori.webpageapi.spotify.dto.SpotifyUserResponseDto;
import dario.gmori.webpageapi.spotify.dto.SpotifyUserResponseDtoMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SpotifyUserService {
    private final SpotifyUserRepository spotifyUserRepository;
    private final SpotifyUserResponseDtoMapper spotifyUserResponseDtoMapper;
    public SpotifyUserResponseDto getSpotifyInfo() {
        return spotifyUserResponseDtoMapper.apply(spotifyUserRepository.findUserInfo());
    }
}
