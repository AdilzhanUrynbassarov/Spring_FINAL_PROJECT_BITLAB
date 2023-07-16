package kz.bitlab.techorda.spring_final_project.repository;

import jakarta.transaction.Transactional;
import kz.bitlab.techorda.spring_final_project.model.Permission;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public interface PermissionRepository extends JpaRepository<Permission, Long> {

}
