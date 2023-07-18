package kz.bitlab.techorda.spring_final_project.dto;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductDTO {

    private Long id;
    private String product;
    private String description;
    private int price;
}
