package com.vilardev.capril_vilar.entities;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

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

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "owner_id")
    @Schema(description = "Owner associated with this goat farm")
    private Owner owner;

    @OneToMany(mappedBy = "goatFarm", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @Schema(description = "List of goats owned by this farm")
    private Set<Goat> goats = new HashSet<>();

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "address_id")
    @Schema(description = "Address associated with this goat farm")
    private Address address;

    @OneToMany(mappedBy = "goatFarm", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @Schema(description = "List of phone numbers associated with this goat farm")
    private Set<Phone> phones = new HashSet<>();

}