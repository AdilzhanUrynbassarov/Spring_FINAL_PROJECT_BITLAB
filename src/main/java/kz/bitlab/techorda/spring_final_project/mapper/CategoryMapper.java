package kz.bitlab.techorda.spring_final_project.mapper;

import kz.bitlab.techorda.spring_final_project.dto.CategoryDTO;
import kz.bitlab.techorda.spring_final_project.dto.MarketDTO;
import kz.bitlab.techorda.spring_final_project.dto.PriceDTO;
import kz.bitlab.techorda.spring_final_project.model.Category;
import kz.bitlab.techorda.spring_final_project.model.Market;
import kz.bitlab.techorda.spring_final_project.model.Price;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;


@Mapper(componentModel = "spring")
public interface CategoryMapper {

    CategoryDTO toDto(Category category);
    Category toModel(CategoryDTO categoryDTO);

    List<CategoryDTO> toDtoList(List<Category> categoryList);

    List<Category> toModelList(List<CategoryDTO> categoryDTOList);


}
