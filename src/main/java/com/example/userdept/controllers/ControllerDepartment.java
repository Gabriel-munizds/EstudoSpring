package com.example.userdept.controllers;

import com.example.userdept.entities.Departament;
import com.example.userdept.repositories.DepartamentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/department")

public class ControllerDepartment {
    @Autowired
    private DepartamentRepository repositoryDep;

    //Requisições HTTP
    @GetMapping
    public List<Departament> findAll(){
        List<Departament> result = repositoryDep.findAll();
        return result;
    }
    @GetMapping(value = "/{id}")
    public Departament findById(@PathVariable Long id){
        Departament result = repositoryDep.findById(id).get();
        return result;
    }
    @PostMapping
    public Departament setDepartment(@RequestBody Departament departament){
        Departament result = repositoryDep.save(departament);
        return result;
    }

}
