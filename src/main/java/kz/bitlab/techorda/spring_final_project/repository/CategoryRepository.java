package kz.bitlab.techorda.spring_final_project.repository;

import kz.bitlab.techorda.spring_final_project.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
}
