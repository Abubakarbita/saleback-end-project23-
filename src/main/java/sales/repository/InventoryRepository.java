package sales.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import sales.model.Inventory;

public interface InventoryRepository extends JpaRepository<Inventory, Long>{

}
