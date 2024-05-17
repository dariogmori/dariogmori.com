package dario.gmori.webpageapi;

import dario.gmori.webpageapi.spotify.SpotifyController;
import dario.gmori.webpageapi.spotify.SpotifyService;
import org.apache.catalina.security.SecurityConfig;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Import;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(SpotifyController.class)
@AutoConfigureMockMvc
@Import(SecurityConfig.class)
public class SpotifyControllerTest {
    @Autowired
    MockMvc mockMvc;

    @MockBean
    SpotifyService spotifyService;

    @Test
    void getSpotifyInfoShouldReturn200() throws Exception{
        mockMvc.perform(get("/spotify/info"))
                .andExpect(status().isOk());
    }
}
