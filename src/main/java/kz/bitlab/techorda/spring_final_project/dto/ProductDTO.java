package kz.bitlab.techorda.spring_final_project.dto;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductDTO {

    private Long id;
    private CategoryDTO category;
    private String description;
    private int price;
}
