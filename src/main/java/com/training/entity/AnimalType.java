package com.training.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;

@Entity @Getter @Setter
public class AnimalType extends DatabaseObject{
    private Integer legCount;
    private String terrain;


}
