package com.vilardev.capril_vilar.entities;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.*;

import java.time.LocalDate;

@Entity
@Table(name = "goats")
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Builder
@ToString(exclude = {"father", "mother"})
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Schema(description = "Entidade que representa uma cabra no sistema")
public class Goat {

    @Id
    @Column(name = "registration_number", unique = true, nullable = false, length = 20)
    @EqualsAndHashCode.Include
    @NotBlank(message = "Registration number cannot be blank")
    @Schema(
            description = "Número de registro oficial (identificador único)",
            example = "1643218013",
            requiredMode = Schema.RequiredMode.REQUIRED
    )
    private String registrationNumber;

    @Column(nullable = false, length = 100)
    @NotBlank(message = "Name cannot be blank")
    @Size(min = 2, max = 100, message = "Name must be between 2 and 100 characters")
    @Schema(description = "Nome oficial da cabra", example = "Bella", requiredMode = Schema.RequiredMode.REQUIRED)
    private String name;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false, length = 10)
    @Schema(description = "Sexo biológico", example = "FEMALE", requiredMode = Schema.RequiredMode.REQUIRED)
    private Gender gender;

    @Column(length = 50)
    @Schema(description = "Raça da cabra", example = "Saanen")
    private String breed;

    @Column(length = 30)
    @Schema(description = "Cor predominante", example = "Branca")
    private String color;

    @Column(name = "birth_date", nullable = false)
    @Past(message = "Birth date must be in the past")
    @Schema(description = "Data de nascimento no formato ISO", example = "2023-05-15", type = "string", format = "date")
    private LocalDate birthDate;


    @Column(nullable = false, length = 15)
    @Schema(description = "Status atual no rebanho", example = "ACTIVE")
    @Enumerated(EnumType.STRING)
    private GoatStatus status;

    @Column(name = "tag_right_ear", length = 15)
    @Pattern(regexp = "^[A-Z]{2}-\\d{5}$", message = "Right ear tag format invalid")
    @Schema(description = "Número da tag da orelha direita", example = "TR-16422")
    private String tod;

    @Column(name = "tag_left_ear", length = 15)
    @Pattern(regexp = "^[A-Z]{2}-\\d{5}$", message = "Left ear tag format invalid")
    @Schema(description = "Número da tag da orelha esquerda", example = "TL-16423")
    private String toe;

    @Column(length = 10)
    @Schema(description = "Categoria de pureza da raça", example = "PO",
            allowableValues = {"PO", "PC", "LA"})
    private String category;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "father_id", referencedColumnName = "registration_number")
    @Schema(description = "Referência paterna")
    private Goat father;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "mother_id", referencedColumnName = "registration_number")
    @Schema(description = "Referência materna")
    private Goat mother;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "goat_farm_id")
    @Schema(description = "Fazenda onde a cabra está registrada")
    private GoatFarm goatFarm;
}
