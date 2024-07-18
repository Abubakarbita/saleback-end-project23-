package sales.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Inventory {

@Id
    private Long id;
    private String item_name;
    private int quantity;
    private String price;
    private String supplier_id;
    
}
