package com.vilardev.capril_vilar.entities;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "goat_farms")
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Builder
@ToString
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Schema(description = "Entity representing a goat farm in the system")
public class GoatFarm {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    @Schema(description = "Unique identifier of the farm", example = "1", accessMode = Schema.AccessMode.READ_ONLY)
    private Long id;


    @Schema(description = "Official name of the farm", example = "Happy Goat Ranch", required = true)
    private String name;

     @Schema(
            description = "Official farm identification tag",
            example = "FARM-2023-001",
            pattern = "^[A-Z]{4}-\\d{4}-\\d{3}$"
    )
    private String tod;

    // Relacionamentos podem ser adicionados posteriormente
    // @OneToMany(mappedBy = "farm")
    // private List<Goat> goats;
}