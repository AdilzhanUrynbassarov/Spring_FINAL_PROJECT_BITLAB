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
    public List<ProductDTO> getProducts() {
        return productMapper.toDtoList(productRepository.findAll());
    }

    public ProductDTO addProduct(ProductDTO product) {
        return productMapper.toDto(productRepository.save(productMapper.toModel(product)));
    }

    public ProductDTO getProduct(Long id) {
        return productMapper.toDto(productRepository.findById(id).orElse(new Product()));
    }

    public ProductDTO updateProduct(ProductDTO product) {
        return productMapper.toDto(productRepository.save(productMapper.toModel(product)));
    }

    public void deleteProduct(Long id) {
        productRepository.deleteById(id);
    }



}
