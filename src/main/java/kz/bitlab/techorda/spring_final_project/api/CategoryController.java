package kz.bitlab.techorda.spring_final_project.api;


import kz.bitlab.techorda.spring_final_project.dto.CategoryDTO;
import kz.bitlab.techorda.spring_final_project.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/api/category")
public class CategoryController {

    private final CategoryService categoryService;

    @GetMapping(value = "/get-categories")
    public List<CategoryDTO> getCategories() { return categoryService.getCategories();}

    @PostMapping(value = "/add-category")
    public CategoryDTO addCategory(@RequestBody CategoryDTO category) {
        return categoryService.addCategory(category);
    }

}
