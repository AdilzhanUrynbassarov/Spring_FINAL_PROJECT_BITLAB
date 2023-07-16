package kz.bitlab.techorda.spring_final_project.api;

import kz.bitlab.techorda.spring_final_project.dto.ProductDTO;
import kz.bitlab.techorda.spring_final_project.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/api/course")
public class ProductController {

    private final ProductService productService;

    @GetMapping(value = "/get-course-list")
    public List<ProductDTO> getCourses() {
        return productService.getCourses();
    }

    @PostMapping(value = "/add-course")
    public ProductDTO addCourse(@RequestBody ProductDTO course) {
        return productService.addCourse(course);
    }
}
