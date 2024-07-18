package orbitor.lunargate;

import orbitor.lunargate.dto.AlbumDto;
import orbitor.lunargate.entity.Album;
import orbitor.lunargate.mapper.AlbumMapper;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        AlbumDto jacksonAlbumDto = new AlbumDto(
                "Thriller", "Michael Jackson", "Pop", 9, 42);
        Album jacksonAlbum = AlbumMapper.INSTANCE.albumDtoToAlbum(jacksonAlbumDto);

        System.out.println("mapped jackson dto to album");
        System.out.println(jacksonAlbum);

        Album adeleAlbum = new Album(
                1L, "21", "Adele", "Pop", 11, 48,
                LocalDateTime.now(), LocalDateTime.now());
        AlbumDto adeleAlbumDto = AlbumMapper.INSTANCE.albumToAlbumDto(adeleAlbum);

        System.out.println("mapped adele album to album dto");
        System.out.println(adeleAlbumDto);
    }
}