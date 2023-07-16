package kz.bitlab.techorda.spring_final_project.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "t_category")
@Getter
@Setter
public class Category extends BaseModel {
    @Column(name = "category")
    private String category;
}
