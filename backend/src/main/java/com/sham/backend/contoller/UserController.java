package com.sham.backend.contoller;

import com.sham.backend.model.User;
import com.sham.backend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:3000")
public class UserController {

   @Autowired
   private UserRepository userRepository;

   //Postman url
    @PostMapping("/user")
    User newUser(@RequestBody User newUser){
        return userRepository.save(newUser);
    }

    @GetMapping("/users")
    List<User>  getAllUsers() {
        return userRepository.findAll();
    }


}
