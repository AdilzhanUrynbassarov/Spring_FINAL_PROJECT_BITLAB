package kz.bitlab.techorda.spring_final_project.mapper;


import kz.bitlab.techorda.spring_final_project.dto.MarketDTO;
import kz.bitlab.techorda.spring_final_project.dto.PriceDTO;
import kz.bitlab.techorda.spring_final_project.dto.ProductDTO;
import kz.bitlab.techorda.spring_final_project.model.Market;
import kz.bitlab.techorda.spring_final_project.model.Price;
import kz.bitlab.techorda.spring_final_project.model.Product;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")

public interface PriceMapper {

    Price toModel(PriceDTO priceDTO);

    PriceDTO toDto(Price price);


    List<PriceDTO> toDtoList(List<Price> priceList);

    List<Price> toModelList(List<PriceDTO> priceDTOList);

}
