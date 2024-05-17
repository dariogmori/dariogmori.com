package dario.gmori.webpageapi.spotify;

import dario.gmori.webpageapi.spotify.dto.SpotifyResponseDto;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith({MockitoExtension.class, SpringExtension.class})
public class SpotifyServiceTest {
    private SpotifyService spotifyService;

    private SpotifyResponseDto defaultSpotifyResponseDto;
    @BeforeEach
    void setup(){
        spotifyService = new SpotifyService();

        defaultSpotifyResponseDto = new SpotifyResponseDto(
                "test",
                "https://test.com",
                "https://profile_url.com");
    }

    @Test
    void getSpotifyInfoShouldReturnSpotifyResponseDto(){
        SpotifyResponseDto response = spotifyService.getSpotifyInfo();
        assertEquals(defaultSpotifyResponseDto, response);
    }
}
