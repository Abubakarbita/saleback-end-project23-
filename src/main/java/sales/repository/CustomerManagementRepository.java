package sales.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import sales.model.Customermanagement;

public interface CustomerManagementRepository extends JpaRepository<Customermanagement,Long>{

}
