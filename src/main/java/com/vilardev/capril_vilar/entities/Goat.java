package com.vilardev.capril_vilar.entities;

import jakarta.persistence.*;
import io.swagger.v3.oas.annotations.media.Schema;
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
    @EqualsAndHashCode.Include
    @Schema(
            description = "Número de registro oficial (identificador único)",
            example = "TOD + TOE + ANO + ORDEM DE NASCIMENTOS",
            required = true
    )
    private String registrationNumber; // Agora é o ID

    @Schema(description = "Nome da cabra", example = "Bella", required = true)
    private String name;


    @ManyToOne
    @JoinColumn(name = "father_registration_number", referencedColumnName = "registration_number")
    @Schema(description = "Referência paterna")
    private Goat father;

    @ManyToOne
    @JoinColumn(name = "mother_registration_number", referencedColumnName = "registration_number")
    @Schema(description = "Referência materna")
    private Goat mother;
}