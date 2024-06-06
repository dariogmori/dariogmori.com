package dario.gmori.webpageapi.spotify;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import dario.gmori.webpageapi.common.requests.spotify.SpotifyRequestUtils;
import dario.gmori.webpageapi.spotify.dto.SpotifyUserResponseDto;
import dario.gmori.webpageapi.spotify.mappers.SpotifyUserJsonModelMapper;
import dario.gmori.webpageapi.spotify.mappers.SpotifyUserResponseDtoMapper;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.time.LocalDateTime;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@ExtendWith({MockitoExtension.class, SpringExtension.class})
public class SpotifyUserServiceTest {
    private SpotifyUserService spotifyUserService;

    private SpotifyUserResponseDto defaultSpotifyUserResponseDto;
    private SpotifyUser defaultSpotifyUser;

    private ObjectNode defaultUserInfoJson;

    @Mock
    private SpotifyUserRepository spotifyUserRepository;

    @Mock
    private SpotifyRequestUtils spotifyRequestUtils;

    @BeforeEach
    void setup(){
        spotifyUserService = new SpotifyUserService(spotifyUserRepository, new SpotifyUserResponseDtoMapper(), new SpotifyUserJsonModelMapper(),spotifyRequestUtils);

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

        ObjectMapper mapper = new ObjectMapper();

        defaultUserInfoJson = mapper.createObjectNode();
        defaultUserInfoJson.put("display_name", "test");

        // Create external_urls object
        ObjectNode externalUrls = mapper.createObjectNode();
        externalUrls.put("spotify", "https://profile_url.com");
        defaultUserInfoJson.set("external_urls", externalUrls);

        // Create images array
        ArrayNode images = mapper.createArrayNode();
        ObjectNode image = mapper.createObjectNode();
        image.put("url", "https://test.com");
        images.add(image);
        defaultUserInfoJson.set("images", images);
    }

    @Test
    void getSpotifyInfoNormalWorkflow(){
        when(spotifyUserRepository.findUserInfo()).thenReturn(Optional.of(defaultSpotifyUser));
        SpotifyUserResponseDto response = spotifyUserService.getSpotifyInfo();
        assertEquals(defaultSpotifyUserResponseDto, response);
    }

    @Test
    void getSpotifyInfoNeedsToBeCreated(){
        when(spotifyUserRepository.findUserInfo()).thenReturn(Optional.empty());
        when(spotifyRequestUtils.getSpotifyInformation()).thenReturn(defaultUserInfoJson);
        when(spotifyUserRepository.save(any())).thenAnswer(invocation -> invocation.getArgument(0));
        SpotifyUserResponseDto response = spotifyUserService.getSpotifyInfo();
        assertEquals(defaultSpotifyUserResponseDto, response);
    }

    @Test
    void getSpotifyInfoNeedsToBeUpdated(){
        defaultSpotifyUser.setLastModifiedDate(LocalDateTime.now().minusMinutes(1));
        assertTrue(defaultSpotifyUser.timeToRefreshPassed(10));
        when(spotifyUserRepository.findUserInfo()).thenReturn(Optional.of(defaultSpotifyUser));
        when(spotifyRequestUtils.getSpotifyInformation()).thenReturn(defaultUserInfoJson);
        when(spotifyUserRepository.save(any())).thenAnswer(invocation -> invocation.getArgument(0));
        assertTrue(defaultSpotifyUser.timeToRefreshPassed(10));
        SpotifyUserResponseDto response = spotifyUserService.getSpotifyInfo();
        assertEquals(defaultSpotifyUserResponseDto, response);
        assertFalse(defaultSpotifyUser.timeToRefreshPassed(10));
    }
}
