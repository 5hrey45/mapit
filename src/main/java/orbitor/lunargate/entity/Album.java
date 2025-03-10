package orbitor.lunargate.entity;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Album {
    private Long id;

    private String title;

    private String artist;

    private String genre;

    private Integer totalTracks;

    private Integer durationMinutes;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;
}
