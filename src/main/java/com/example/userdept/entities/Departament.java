package com.example.userdept.entities;
//MAPEANDO CLASSE PARA O BANCO DE DADOS
import javax.persistence.*;

//anotation da JPA (ferramenta de ORM - Mapeamento Objeto Relacionamento)
@Entity
//Determinando o nome da tabela Departament no Banco de Dados
@Table(name = "tb_department")

public class Departament {
    //definindo ID como chave primária e autoincrementável
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    public Departament(){
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
}
