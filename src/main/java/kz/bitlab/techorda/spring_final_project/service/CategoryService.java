package kz.bitlab.techorda.spring_final_project.service;

import kz.bitlab.techorda.spring_final_project.dto.CategoryDTO;
import kz.bitlab.techorda.spring_final_project.dto.PriceDTO;
import kz.bitlab.techorda.spring_final_project.mapper.CategoryMapper;
import kz.bitlab.techorda.spring_final_project.model.Category;
import kz.bitlab.techorda.spring_final_project.repository.CategoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor
public class CategoryService {

    private final CategoryMapper categoryMapper;

    private final CategoryRepository categoryRepository;


    public List<CategoryDTO> getCategories() {
        return categoryMapper.toDtoList(categoryRepository.findAll());
    }

    public CategoryDTO addCategory(CategoryDTO category) {
        return categoryMapper.toDto(categoryRepository.save(categoryMapper.toModel(category)));
    }

    public CategoryDTO getCategory(Long id) {
        return categoryMapper.toDto(categoryRepository.findById(id).orElse(new Category()));
    }

    public CategoryDTO updateCategory(CategoryDTO category) {
        return categoryMapper.toDto(categoryRepository.save(categoryMapper.toModel(category)));
    }

    public void deleteCategory(Long id) {
        categoryRepository.deleteById(id);
    }

}
