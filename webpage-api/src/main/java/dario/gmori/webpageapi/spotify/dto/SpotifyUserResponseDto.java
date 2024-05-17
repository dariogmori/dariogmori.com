package dario.gmori.webpageapi.spotify.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SpotifyUserResponseDto {
    private String username;
    private String avatar;
    @JsonProperty("profile_url")
    private String profileUrl;
}
