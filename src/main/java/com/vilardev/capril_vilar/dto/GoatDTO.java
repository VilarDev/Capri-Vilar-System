package com.vilardev.capril_vilar.dto;

import com.vilardev.capril_vilar.entities.Goat;
import com.vilardev.capril_vilar.entities.GoatStatus;

import java.time.LocalDate;

public class GoatDTO {

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

    public GoatDTO() {
    }
}
