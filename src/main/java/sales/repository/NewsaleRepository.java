package sales.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import sales.model.Newsale;

public interface NewsaleRepository extends JpaRepository<Newsale, Long>{

    public List<Newsale> findByNameContainingIgnoreCase(String name);

}
