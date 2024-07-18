package orbitor.lunargate.dto;

import lombok.Data;

@Data
public class AlbumDto {
    private String title;

    private String artist;

    private String genre;

    private Integer totalTracks;

    private Integer durationMinutes;
}
