package orbitor.lunargate.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class AlbumDto {
    private String title;

    private String artist;

    private String genre;

    private Integer totalTracks;

    private Integer durationMinutes;
}
