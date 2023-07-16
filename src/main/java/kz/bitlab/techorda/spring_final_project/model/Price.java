package kz.bitlab.techorda.spring_final_project.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "t_pricelist")
@Getter
@Setter
public class Price extends BaseModel {

    @ManyToOne
    private Market market;

    @ManyToOne
    private Category category;

    @Column(name = "price")
    private int price;
}
