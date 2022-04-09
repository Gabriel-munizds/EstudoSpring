package com.example.userdept.controllers;

import com.example.userdept.entities.User;
import com.example.userdept.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//CRIANDO REST CONTROLLER
@RestController
@RequestMapping(value = "/users")
//CRIANDO ENDPOINTS
public class Controller {
    @Autowired
    private UserRepository repository;
    //requisições HTTP
    @GetMapping
    public List<User> findAll(){
        List<User> result = repository.findAll();
        return result;
    }
    @GetMapping(value = "/{id}")
    public User findById(@PathVariable Long id){
        User result = repository.findById(id).get();
        return result;
    }
    @PostMapping
    public User findById(@RequestBody User user){
        User result = repository.save(user);
        return result;
    }

}
