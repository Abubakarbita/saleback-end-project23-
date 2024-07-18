package sales.model;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Newsale {

    @Id
    private Long id;
    private String itemID;
    private String customerID;
    private int quantity;
    private Date saleDate;
    private int amount;

}
