package com.vilardev.capril_vilar.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.vilardev.capril_vilar.entities.Gender;
import com.vilardev.capril_vilar.entities.GoatStatus;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@JsonInclude(JsonInclude.Include.NON_NULL)
@Schema(description = "DTO para representação completa de uma cabra no sistema")
public class GoatDTO {

    @Schema(description = "Número de registro único da cabra (10 dígitos)", example = "1643218012", pattern = "^\\d{10}$", requiredMode = Schema.RequiredMode.REQUIRED)
    private String registrationNumber;

    @Schema(description = "Nome oficial do animal", example = "Bella da Fazenda Feliz", requiredMode = Schema.RequiredMode.REQUIRED)
    private String name;

    @Schema(description = "Raça predominante conforme registro", example = "Saanen", allowableValues = {"Saanen", "Alpina", "Anglonubiana", "Boer"})
    private String breed;

    @Schema(description = "Coloração principal da pelagem", example = "Branca com manchas marrons")
    private String color;

    @Schema(implementation = Gender.class, description = "Sexo biológico do animal", example = "FEMALE", requiredMode = Schema.RequiredMode.REQUIRED)
    private Gender gender;

    @Schema(description = "Categoria de pureza racial", example = "PO", allowableValues = {"PO", "PA", "PC", "LA"})
    private String category;

    @Schema(description = "Identificação da tag da orelha direita (TOD)", example = "TR-16422", pattern = "^[A-Z]{2}-\\d{5}$")
    private String tod;

    @Schema(description = "Identificação da tag da orelha esquerda (TOE)", example = "TL-16423", pattern = "^[A-Z]{2}-\\d{5}$")
    private String toe;

    @Schema(description = "Data de nascimento no formato ISO 8601", example = "2023-05-15", type = "string", format = "date", requiredMode = Schema.RequiredMode.REQUIRED)
    private LocalDate birthDate;

    @Schema(implementation = GoatStatus.class, description = "Status atual no rebanho", example = "ACTIVE", requiredMode = Schema.RequiredMode.REQUIRED)
    private GoatStatus status;

    @Schema(description = "Dados genealógicos certificados dos progenitores")
    private GoatParentDTO parents; // Esta propriedade deve estar presente

    // Construtor adicional para inicializar todos os campos, incluindo 'parents'
    public GoatDTO(String registrationNumber, String name, String breed, String color, Gender gender, String category, String tod, String toe, LocalDate birthDate, GoatStatus status, GoatParentDTO parents) {
        this.registrationNumber = registrationNumber;
        this.name = name;
        this.breed = breed;
        this.color = color;
        this.gender = gender;
        this.category = category;
        this.tod = tod;
        this.toe = toe;
        this.birthDate = birthDate;
        this.status = status;
        this.parents = parents;
    }
}
