package com.vilardev.capril_vilar.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.vilardev.capril_vilar.entities.Gender;
import com.vilardev.capril_vilar.entities.GoatStatus;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

import java.time.LocalDate;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Schema(description = "DTO para representação de cabras em operações REST")
public class GoatDTO {

    @Schema(example = "Bella", description = "Nome oficial da cabra", required = true)
    private String name;

    @Schema(example = "Saanen", description = "Raça da cabra conforme registro")
    private String breed;

    @Schema(example = "Branca", description = "Coloração predominante do animal")
    private String color;

    @Schema(implementation = Gender.class,
            description = "Gênero biológico do animal",
            example = "FEMALE",
            allowableValues = {"MALE", "FEMALE", "UNKNOWN"})
    private Gender gender;  // Agora usando enum

    @Schema(example = "PO",
            description = "Categoria de pureza da raça (PO = Puro de Origem)",
            allowableValues = {"PO", "PC", "LA"})
    private String category;

    @Schema(example = "16422",
            description = "Número de identificação da orelha direita (TOD - Tag Orelha Direita)",
            pattern = "\\d{1,10}")
    private String tod;

    @Schema(example = "16423",
            description = "Número de identificação da orelha esquerda (TOE - Tag Orelha Esquerda)")
    private String toe;

    @Schema(example = "2020-05-15",
            description = "Data de nascimento no formato ISO (YYYY-MM-DD)",
            type = "string", format = "date")
    private LocalDate birthDate;

    @Schema(implementation = GoatStatus.class,
            description = "Status de vida útil do animal no sistema",
            example = "ACTIVE")
    private GoatStatus status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @Schema(description = "Informações genealógicas certificadas")
    private GoatParentDTO parents;
}