package kz.bitlab.techorda.spring_final_project;

import kz.bitlab.techorda.spring_final_project.dto.PriceDTO;
import kz.bitlab.techorda.spring_final_project.dto.ProductDTO;
import kz.bitlab.techorda.spring_final_project.mapper.PriceMapper;
import kz.bitlab.techorda.spring_final_project.mapper.ProductMapper;
import kz.bitlab.techorda.spring_final_project.model.Price;
import kz.bitlab.techorda.spring_final_project.model.Product;
import kz.bitlab.techorda.spring_final_project.service.PriceService;
import kz.bitlab.techorda.spring_final_project.service.ProductService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class TestApp {


    @Autowired
    private PriceMapper priceMapper;

    @Autowired
    private PriceService priceService;

    @Autowired
    private ProductMapper productMapper;

    @Autowired
    private ProductService productService;


    @Test
    void CheckProductDTO() {
        Product product = new Product();
        product.setId(12L);
        product.setName("Перец");
        product.setDescription("Болгарский перец");
        product.setPrice(300);

        ProductDTO productDTO = productMapper.toDto(product);

        Assertions.assertEquals(product.getName(), productDTO.getProduct());
        Assertions.assertEquals(product.getId(), productDTO.getId());
        Assertions.assertEquals(product.getDescription(), productDTO.getDescription());
        Assertions.assertEquals(product.getPrice(), productDTO.getPrice());

    }

    @Test
    void checkInsertProduct() {
        Product product = new Product();
        product.setId(12L);
        product.setName("Перец");
        product.setDescription("Болгарский перец");
        product.setPrice(300);

        ProductDTO newProduct = productMapper.toDto(product);

        Assertions.assertNotNull(newProduct);
        Assertions.assertNotNull(newProduct.getId());
        Assertions.assertEquals(product.getName(), newProduct.getProduct());
        Assertions.assertEquals(product.getDescription(), newProduct.getDescription());
        Assertions.assertEquals(product.getPrice(), newProduct.getPrice());
        productService.deleteProduct(product.getId());
    }

    @Test
    void CheckPriceDTO() {
        Price price = new Price();
        price.setId(12L);
        price.setName("Алтын Орда");
        price.setProduct("Говядина");
        price.setPrice(255);

        PriceDTO priceDTO = priceMapper.toDto(price);

        Assertions.assertEquals(price.getName(), priceDTO.getMarket());
        Assertions.assertEquals(price.getId(), priceDTO.getId());
        Assertions.assertEquals(price.getProduct(), priceDTO.getProduct());
        Assertions.assertEquals(price.getPrice(), priceDTO.getPrice());

    }

    @Test
    void checkInsertPrice() {
        Price price = new Price();
        price.setId(12L);
        price.setName("Барлык");
        price.setProduct("Картофель");
        price.setPrice(455);

        PriceDTO newPrice = priceMapper.toDto(price);

        Assertions.assertNotNull(newPrice);
        Assertions.assertNotNull(newPrice.getId());
        Assertions.assertEquals(price.getName(), newPrice.getMarket());
        Assertions.assertEquals(price.getProduct(), newPrice.getProduct());
        Assertions.assertEquals(price.getPrice(), newPrice.getPrice());
        priceService.deletePrice(price.getId());
    }

}
