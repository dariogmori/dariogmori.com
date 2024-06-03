package dario.gmori.webpageapi.spotify;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Table(name = "spotify_users")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class SpotifyUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String username;

    @Column
    private String avatar;

    @Column(name="profile_url")
    private String profileUrl;

    @Column(name="last_modified_date")
    private LocalDateTime lastModifiedDate;
}
