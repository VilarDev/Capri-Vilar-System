package com.vilardev.capril_vilar.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Schema(description = "DTO para representar os pais de uma cabra")
public class GoatParentDTO {

    @Schema(description = "Nome do pai", example = "C.V.C SIGNOS PETROLEO")
    private String fatherName;

    @Schema(description = "Número de registro do pai", example = "1635717065")
    private String fatherRegistrationNumber;

    @Schema(description = "Nome da mãe", example = "NAIDE DO CRS")
    private String motherName;

    @Schema(description = "Número de registro da mãe", example = "2114517012")
    private String motherRegistrationNumber;
}
