package sales.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import sales.model.Users;

public interface UserRepository extends JpaRepository<Users, Long> {

    public Users findByUsernameAndPassword(String username, String password);

}
