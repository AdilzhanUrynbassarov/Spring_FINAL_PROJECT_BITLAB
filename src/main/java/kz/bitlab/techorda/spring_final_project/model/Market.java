package kz.bitlab.techorda.spring_final_project.model;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "t_market")
@Getter
@Setter
public class Market extends BaseModel {

    @Column(name = "name")
    private String name;


}
