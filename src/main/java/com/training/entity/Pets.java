package com.training.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;

@Entity @Getter @Setter
public class Pets {
    private String name;
    private String raceName;
    private String animalType;
}
