package sales.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Customermanagement {

    @Id
    private Long id;

    private String customerName;
    private String contactDetail;
    private String purchaseHistory;
}
