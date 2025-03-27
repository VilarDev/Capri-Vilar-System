package com.vilardev.capril_vilar.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

@Getter
@Builder
@AllArgsConstructor
@Schema(description = "Informações básicas para montagem da genealogia do animal")
public class GoatParentDTO {

    @Schema(example = "Thor", description = "Nome registrado do pai na associação")
    private String fatherName;

    @Schema(example = "GOAT-001", description = "Número de registro único do pai")
    private String fatherRegistrationNumber;

    @Schema(example = "Freyja", description = "Nome registrado da mãe na associação")
    private String motherName;

    @Schema(example = "GOAT-002", description = "Número de registro único da mãe")
    private String motherRegistrationNumber;

    public GoatParentDTO() {
    }
}
