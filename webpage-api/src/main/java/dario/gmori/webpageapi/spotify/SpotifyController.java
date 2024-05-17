package dario.gmori.webpageapi.spotify;

import dario.gmori.webpageapi.spotify.dto.SpotifyResponseDto;
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
    private final SpotifyService service;
    @GetMapping("/info")
    public ResponseEntity<SpotifyResponseDto> getUser(){
        return new ResponseEntity<SpotifyResponseDto>(service.getSpotifyInfo(), HttpStatus.OK);
    }
}
