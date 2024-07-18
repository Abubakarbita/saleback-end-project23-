package sales.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import sales.model.Newsale;
import sales.repository.NewsaleRepository;

@RestController
@RequestMapping("/api/vi")
public class SalesReportController {
    @Autowired
    private NewsaleRepository repo;

    @PostMapping("/saveSale")
    public Newsale insertItem(@RequestBody Newsale req) {
        return repo.save(req);
    }

    @GetMapping("/newsale/{id}")
    public Optional<Newsale> getItem(@PathVariable Long id) {
        return repo.findById(id);
    }

    @GetMapping("/newsale")
    public List<Newsale> getAllItems() {
        return repo.findAll();
    }

    @GetMapping("/newsale/search")
    public List<Newsale> searchItems(@RequestParam String name) {
        return repo.findByNameContainingIgnoreCase(name);
    }
}
