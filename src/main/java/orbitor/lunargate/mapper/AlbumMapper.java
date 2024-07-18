package orbitor.lunargate.mapper;

import orbitor.lunargate.dto.AlbumDto;
import orbitor.lunargate.entity.Album;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

@Mapper
public interface AlbumMapper {

    // create an instance to access the methods without mapper object
    AlbumMapper INSTANCE = Mappers.getMapper(AlbumMapper.class);

    AlbumDto albumToAlbumDto(Album album);

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "createdAt", ignore = true)
    @Mapping(target = "updatedAt", ignore = true)
    Album albumDtoToAlbum(AlbumDto albumDto);

    void updateAlbumFromAlbumDto(AlbumDto albumDto, @MappingTarget Album album);
}
