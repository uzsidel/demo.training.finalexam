package com.training.model;

public enum LegCount {

    ZERO_LEGS("ZERO_LEGS"),
    TWO_LEGS("TWO_LEGS"),
    FOUR_LEGS("FOUR_LEGS");

    private final String status;

    LegCount(String status) {
        this.status=status;
    }
}
