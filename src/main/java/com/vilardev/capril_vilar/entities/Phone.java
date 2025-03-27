package com.vilardev.capril_vilar.entities;

import lombok.*;

@AllArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Phone {

    private Long id;
    private String number;

    public Phone() {
    }
}
