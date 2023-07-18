package kz.bitlab.techorda.spring_final_project.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PriceDTO {

    private Long id;

    private String market;

    private String product;

    private int price;
}
