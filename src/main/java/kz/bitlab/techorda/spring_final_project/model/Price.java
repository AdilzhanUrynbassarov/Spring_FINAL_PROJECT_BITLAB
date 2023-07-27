package kz.bitlab.techorda.spring_final_project.model;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Entity
@Table(name = "t_pricelist")
@Getter
@Setter
public class Price extends BaseModel {

    @Column(name = "name")
    private String name;

    @Column(name = "product")
    private String product;

    @Column(name = "price")
    private int price;
}
