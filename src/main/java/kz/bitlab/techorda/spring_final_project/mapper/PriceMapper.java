package kz.bitlab.techorda.spring_final_project.mapper;


import kz.bitlab.techorda.spring_final_project.dto.PriceDTO;
import kz.bitlab.techorda.spring_final_project.model.Price;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")

public interface PriceMapper {


    @Mapping(source = "market", target = "name")
    Price toModel(PriceDTO priceDTO);

    @Mapping(source = "name", target = "market")
    PriceDTO toDto(Price price);


    List<PriceDTO> toDtoList(List<Price> priceList);

    List<Price> toModelList(List<PriceDTO> priceDTOList);

}
