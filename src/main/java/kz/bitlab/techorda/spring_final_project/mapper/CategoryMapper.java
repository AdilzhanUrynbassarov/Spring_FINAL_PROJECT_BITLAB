package kz.bitlab.techorda.spring_final_project.mapper;

import kz.bitlab.techorda.spring_final_project.dto.CategoryDTO;
import kz.bitlab.techorda.spring_final_project.dto.MarketDTO;
import kz.bitlab.techorda.spring_final_project.model.Category;
import kz.bitlab.techorda.spring_final_project.model.Market;
import org.mapstruct.Mapping;

public interface CategoryMapper {

    CategoryDTO toDto(Category category);
    Category toDto(CategoryDTO categoryDTO);

}
