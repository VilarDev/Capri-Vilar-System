package com.vilardev.capril_vilar.entities;

import lombok.*;

@AllArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class GoatFarm {

    private Long id;
    private String name;
    private String tod;

    public GoatFarm() {
    }
}
