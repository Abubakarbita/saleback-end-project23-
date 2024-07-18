package sales.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data

@Entity
public class Users {
    @Id
    private Long id;
    private String fullName;
    private String username;
    private String password;

}
