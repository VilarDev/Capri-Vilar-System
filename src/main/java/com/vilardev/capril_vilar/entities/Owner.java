package com.vilardev.capril_vilar.entities;

import lombok.*;

@AllArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Owner {

    private Long id;
    private String name;
    private String email;

    public Owner() {
    }
}
