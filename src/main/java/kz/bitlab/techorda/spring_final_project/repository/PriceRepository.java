package kz.bitlab.techorda.spring_final_project.repository;

import kz.bitlab.techorda.spring_final_project.model.Price;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PriceRepository extends JpaRepository<Price, Long> {
}
