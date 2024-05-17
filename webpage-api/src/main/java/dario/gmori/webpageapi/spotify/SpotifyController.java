package dario.gmori.webpageapi.spotify;

import dario.gmori.webpageapi.spotify.dto.SpotifyUserResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/spotify")
@RequiredArgsConstructor
public class SpotifyController {
    private final SpotifyUserService service;
    @GetMapping("/info")
    public ResponseEntity<SpotifyUserResponseDto> getUser(){
        return new ResponseEntity<>(service.getSpotifyInfo(), HttpStatus.OK);
    }
}
