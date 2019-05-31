package com.training.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import java.util.List;
@Entity @Getter @Setter
public class Persona extends  DatabaseObject{
    @Column(name = "name", nullable = false)
    private String name;
    @Column(name = "age", nullable = false)
    private Integer age;
    @Column(name = "age", nullable = false)
    @OneToMany(fetch = FetchType.LAZY)
    private List<Pets>pets;

    public Persona(String name, Integer age, List<Pets> pets) {
        this.name = name;
        this.age = age;
        this.pets = pets;
    }


}
