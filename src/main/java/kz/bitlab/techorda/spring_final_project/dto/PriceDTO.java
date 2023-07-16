package kz.bitlab.techorda.spring_final_project.dto;

import jakarta.persistence.Column;
import jakarta.persistence.ManyToOne;
import kz.bitlab.techorda.spring_final_project.model.Category;
import kz.bitlab.techorda.spring_final_project.model.Market;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PriceDTO {

    private Long id;

    private MarketDTO market;

    private CategoryDTO category;

    private int price;
}
