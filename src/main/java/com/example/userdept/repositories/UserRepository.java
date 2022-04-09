package com.example.userdept.repositories;

import com.example.userdept.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
//criando objeto responsável por acessar dados da minha entidade User
public interface UserRepository extends JpaRepository<User,Long> {

}
