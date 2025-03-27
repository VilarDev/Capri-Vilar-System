package com.vilardev.capril_vilar.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class AddressDTO {

    private Long id;
    private String street;
    private String city;
    private String state;
    private String postalCode;
    private String country;

    public AddressDTO() {
    }

}
