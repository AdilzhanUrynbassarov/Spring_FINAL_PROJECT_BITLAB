package kz.bitlab.techorda.spring_final_project.dto;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductDTO {

    private Long id;
    private String courseName;
    private String description;

    private int price;
}
