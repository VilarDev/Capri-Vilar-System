package com.vilardev.capril_vilar.entities;

import lombok.*;

@AllArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Address {

    private Long id;
    private String street;
    private String city;
    private String state;
    private String postalCode;
    private String country;

    public Address() {
    }
}
