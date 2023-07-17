package kz.bitlab.techorda.spring_final_project.mapper;


import kz.bitlab.techorda.spring_final_project.dto.ProductDTO;
import kz.bitlab.techorda.spring_final_project.model.Product;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")

public interface ProductMapper {

    ProductDTO toDto(Product product);

    Product toModel(ProductDTO productDTO);

    List<ProductDTO> toDtoList(List<Product> productList);

    List<Product> toModelList(List<ProductDTO> productList);
}
