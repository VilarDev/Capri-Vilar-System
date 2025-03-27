package com.vilardev.capril_vilar.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class PhoneDTO {

        private Long id;
        private String number;

        public PhoneDTO() {}

    }
