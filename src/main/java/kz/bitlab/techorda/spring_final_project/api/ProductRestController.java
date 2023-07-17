package kz.bitlab.techorda.spring_final_project.api;

import kz.bitlab.techorda.spring_final_project.dto.ProductDTO;
import kz.bitlab.techorda.spring_final_project.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/product")
@RequiredArgsConstructor
public class ProductRestController {

    private final ProductService productService;
    @GetMapping
    public List<ProductDTO> productList() {
        return productService.getProducts();
    }
    @GetMapping(value = "{id}")
    public ProductDTO getProduct(@PathVariable(name = "id") Long id) {
        return productService. getProduct(id);
    }

    @PostMapping
    @PreAuthorize("hasAnyRole('ROLE_ADMIN')")
    public ProductDTO addProduct(@RequestBody ProductDTO product) {
        return productService.addProduct(product);
    }
    @PutMapping
    @PreAuthorize("hasAnyRole('ROLE_ADMIN')")
    public ProductDTO updateProduct(@RequestBody ProductDTO product) {
       return productService.updateProduct(product);
    }
    @DeleteMapping(value = "{id}")
    @PreAuthorize("hasAnyRole('ROLE_ADMIN')")
    public void deleteProduct(@PathVariable(name = "id") Long id) {
        productService.deleteProduct(id);
    }
}
