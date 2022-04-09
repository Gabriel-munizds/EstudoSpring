package com.example.userdept.repositories;

import com.example.userdept.entities.Departament;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartamentRepository extends JpaRepository<Departament,Long> {
}
