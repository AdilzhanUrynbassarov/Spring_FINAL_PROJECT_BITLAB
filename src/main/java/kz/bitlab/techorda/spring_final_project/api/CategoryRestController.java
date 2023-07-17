package kz.bitlab.techorda.spring_final_project.api;

import kz.bitlab.techorda.spring_final_project.dto.CategoryDTO;
import kz.bitlab.techorda.spring_final_project.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/category")
@RequiredArgsConstructor
public class CategoryRestController {
    
    private final CategoryService categoryService;
    
    @GetMapping
    public List<CategoryDTO> categoryList() {
        return categoryService.getCategories();
    }


    @GetMapping(value = "{id}")
    public CategoryDTO getcategory(@PathVariable(name = "id") Long id) {
        return categoryService. getCategory(id);
    }


    @PostMapping
    @PreAuthorize("hasAnyRole('ROLE_ADMIN')")
    public CategoryDTO addcategory(@RequestBody CategoryDTO category) {
        return categoryService.addCategory(category);
    }
    @PutMapping
    @PreAuthorize("hasAnyRole('ROLE_ADMIN')")
    public CategoryDTO updateCategory(@RequestBody CategoryDTO category) {
        return categoryService.updateCategory(category);
    }
    @DeleteMapping(value = "{id}")
    @PreAuthorize("hasAnyRole('ROLE_ADMIN')")
    public void deleteCategory(@PathVariable(name = "id") Long id) {
        categoryService.deleteCategory(id);
    }
    
}
