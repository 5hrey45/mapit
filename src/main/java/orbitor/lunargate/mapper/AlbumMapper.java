package orbitor.lunargate.mapper;

import orbitor.lunargate.dto.AlbumDto;
import orbitor.lunargate.entity.Album;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface AlbumMapper {

    AlbumDto albumToAlbumDto(Album album);

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "createdAt", ignore = true)
    @Mapping(target = "updatedAt", ignore = true)
    Album albumDtoToAlbum(AlbumDto albumDto);
}
