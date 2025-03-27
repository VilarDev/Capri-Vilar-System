package com.vilardev.capril_vilar.entities;

import java.time.LocalDate;

public class Goat {

    private String registrationNumber;

    private String name;
    private String breed;
    private String color;
    private GoatStatus status;
    private String gender;
    private String category;
    private String tod;
    private String toe;
    private LocalDate birthDate;

    private Goat father;
    private Goat mother;

    public Goat() {
    }
}
