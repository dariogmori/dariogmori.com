package dario.gmori.webpageapi.spotify;

import dario.gmori.webpageapi.spotify.dto.SpotifyResponseDto;
import org.springframework.stereotype.Service;

@Service
public class SpotifyService {
    public SpotifyResponseDto getSpotifyInfo() {
        return new SpotifyResponseDto(
                "test",
                "https://test.com",
                "https://profile_url.com");
    }
}
