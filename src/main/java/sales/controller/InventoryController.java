package sales.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import sales.model.Inventory;
import sales.repository.InventoryRepository;

@CrossOrigin
@RestController
@RequestMapping("/api/v1")
public class InventoryController {

    @Autowired
    private InventoryRepository inventoryRepository;

    @GetMapping("/inventory")
    public List<Inventory> getItems() {
        return inventoryRepository.findAll();
    }

    @GetMapping("/inventory/{id}")
    public Optional<Inventory> getItem(@PathVariable Long id) {
        return inventoryRepository.findById(id);
    }

    // Add Iventory

    @PostMapping("/inventory")
    public Inventory addItem(@RequestBody Inventory inventory){
        return inventoryRepository.save(inventory);
     }
}

