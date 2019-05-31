package com.training.model;

public enum Terrain {
    WATER("WATER"),
    EARTH("WATER"),
    SKY("WATER");

    private String status;

    Terrain(String status) {
        this.status = status;
    }
}
