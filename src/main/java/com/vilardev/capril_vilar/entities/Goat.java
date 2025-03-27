package com.vilardev.capril_vilar.entities;

import lombok.*;

import java.time.LocalDate;

@AllArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Goat {

    private String registrationNumber;

    private String name;
    private String breed;
    private String color;
    private String gender;
    private String category;
    private String tod;
    private String toe;
    private LocalDate birthDate;

    private GoatStatus status;

    private Goat father;
    private Goat mother;

    public Goat() {
    }
}
