package kz.bitlab.techorda.spring_final_project.model;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "t_pricelist")
@Getter
@Setter
public class Price extends BaseModel {

    @ManyToOne(cascade = CascadeType.PERSIST)
    private Market market;

    @ManyToOne(cascade = CascadeType.PERSIST)
    private Category category;

    @Column(name = "price")
    private int price;
}
