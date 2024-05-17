package dario.gmori.webpageapi.spotify;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SpotifyUserRepository extends JpaRepository<SpotifyUser, Long> {
    SpotifyUser findUserInfo();
}
