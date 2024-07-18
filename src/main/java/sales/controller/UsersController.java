package sales.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import sales.Dto.LoginReq;
import sales.model.Users;
import sales.repository.UserRepository;

@RestController
public class UsersController {

    @Autowired
    private UserRepository userRepo;

 @PostMapping("/saveUsers")
 public Users insertUsers(@RequestBody Users req){
    return userRepo.save(req);
 }

 @GetMapping("/getUsers")
 public List<Users> gettUsers(){
    return userRepo.findAll();
 }

 @GetMapping("/getUserById/{id}")
 public Optional<Users> getUserById(@PathVariable Long id){
    return userRepo.findById(id);
 }


 @PostMapping("/login")
 public Users login(@RequestBody LoginReq req){
    return userRepo.findByUsernameAndPassword(req.getUsername(),req.getPassword());
 }


}
