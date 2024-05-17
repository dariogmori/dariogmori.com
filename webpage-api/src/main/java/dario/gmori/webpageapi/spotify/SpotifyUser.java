package dario.gmori.webpageapi.spotify;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class SpotifyUser {
    private String username;
    private String avatar;
    private String profileUrl;
}
