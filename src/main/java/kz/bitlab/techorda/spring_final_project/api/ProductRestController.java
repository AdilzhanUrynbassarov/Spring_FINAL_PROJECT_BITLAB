package kz.bitlab.techorda.spring_final_project.api;

import kz.bitlab.techorda.spring_final_project.dto.ProductDTO;
import kz.bitlab.techorda.spring_final_project.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/course")
@RequiredArgsConstructor
public class ProductRestController {

    private final ProductService productService;
    @GetMapping
    public List<ProductDTO> courseList() {
        return productService.getCourses();
    }
    @GetMapping(value = "{id}")
    public ProductDTO getCourse(@PathVariable(name = "id") Long id) {
        return productService. getCourse(id);
    }


    @PostMapping
    @PreAuthorize("hasAnyRole('ROLE_ADMIN')")
    public ProductDTO addCourse(@RequestBody ProductDTO course) {
        return productService.addCourse(course);
    }
    @PutMapping
    @PreAuthorize("hasAnyRole('ROLE_ADMIN')")
    public ProductDTO updateCourse(@RequestBody ProductDTO course) {
       return productService.updateCourse(course);
    }
    @DeleteMapping(value = "{id}")
    @PreAuthorize("hasAnyRole('ROLE_ADMIN')")
    public void deleteCourse(@PathVariable(name = "id") Long id) {
        productService.deleteCourse(id);
    }
}
