package dario.gmori.webpageapi.spotify;

import dario.gmori.webpageapi.spotify.dto.SpotifyUserResponseDto;
import dario.gmori.webpageapi.spotify.dto.SpotifyUserResponseDtoMapper;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.time.LocalDateTime;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith({MockitoExtension.class, SpringExtension.class})
public class SpotifyUserServiceTest {
    private SpotifyUserService spotifyUserService;

    private SpotifyUserResponseDto defaultSpotifyUserResponseDto;
    private SpotifyUser defaultSpotifyUser;

    @Mock
    private SpotifyUserRepository spotifyUserRepository;
    @BeforeEach
    void setup(){
        spotifyUserService = new SpotifyUserService(spotifyUserRepository, new SpotifyUserResponseDtoMapper());

        defaultSpotifyUserResponseDto = new SpotifyUserResponseDto(
                "test",
                "https://test.com",
                "https://profile_url.com");
        defaultSpotifyUser = new SpotifyUser(
                1L,
                "test",
                "https://test.com",
                "https://profile_url.com",
                LocalDateTime.now()
                );
    }

    @Test
    void getSpotifyInfoShouldReturnSpotifyResponseDto(){
        when(spotifyUserRepository.findUserInfo()).thenReturn(Optional.of(defaultSpotifyUser));
        SpotifyUserResponseDto response = spotifyUserService.getSpotifyInfo();
        assertEquals(defaultSpotifyUserResponseDto, response);
    }
}
