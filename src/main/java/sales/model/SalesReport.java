package sales.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class SalesReport {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Specify the generation strategy
    private long id;

    private String customerId;
    private String supplierId;
}
