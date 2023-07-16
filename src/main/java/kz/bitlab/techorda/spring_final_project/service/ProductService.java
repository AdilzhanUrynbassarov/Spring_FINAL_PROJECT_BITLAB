package kz.bitlab.techorda.spring_final_project.service;

import kz.bitlab.techorda.spring_final_project.dto.ProductDTO;
import kz.bitlab.techorda.spring_final_project.mapper.ProductMapper;
import kz.bitlab.techorda.spring_final_project.model.Product;
import kz.bitlab.techorda.spring_final_project.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;

    private final ProductMapper productMapper;
    public List<ProductDTO> getCourses() {
        return productMapper.toDtoList(productRepository.findAll());
    }

    public ProductDTO addCourse(ProductDTO course) {
        return productMapper.toDto(productRepository.save(productMapper.toModel(course)));
    }

    public ProductDTO getCourse(Long id) {
        return productMapper.toDto(productRepository.findById(id).orElse(new Product()));
    }

    public ProductDTO updateCourse(ProductDTO course) {
        return productMapper.toDto(productRepository.save(productMapper.toModel(course)));
    }

    public void deleteCourse(Long id) {
        productRepository.deleteById(id);
    }


}
