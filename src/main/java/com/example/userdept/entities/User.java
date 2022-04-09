package com.example.userdept.entities;

import javax.persistence.*;

//MAPEANDO CLASSE PARA O MODELO RELACIONAL DO BANCO DE DADOS ATRAVES DA ORM JPA
@Entity
//definindo o nome da tabela User
@Table(name = "tb_user")
public class User {
    //definindo ID como chave primária da tabela User e autoincrementável
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    //definindo relacionamento entre as tabelas User e Departament
    @ManyToOne
    //criando chave estrangeira
    @JoinColumn(name = "department_id")
    private Departament departament;

    public User(){

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Departament getDepartament() {
        return departament;
    }

    public void setDepartament(Departament departament) {
        this.departament = departament;
    }
}
