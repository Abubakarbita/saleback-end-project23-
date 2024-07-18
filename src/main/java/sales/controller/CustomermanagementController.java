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

import sales.model.Customermanagement;
import sales.repository.CustomerManagementRepository;

@CrossOrigin
@RestController
@RequestMapping("/customerManagement")
public class CustomermanagementController {

    @Autowired
    private CustomerManagementRepository customerManagementRepository;

    @GetMapping
    public List<Customermanagement> getCustomers() {
        return customerManagementRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Customermanagement> getCustomer(@PathVariable Long id) {
        return customerManagementRepository.findById(id);
    }

    @PostMapping
    public Customermanagement addCustomer(@RequestBody Customermanagement customerManagement) {
        return customerManagementRepository.save(customerManagement);
    }
}
