package com.vilardev.capril_vilar.entities;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "owners")
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Builder
@ToString
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Schema(description = "Entity representing an animal owner in the system")
public class Owner {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    @Schema(description = "Unique identifier of the owner",
            example = "1",
            accessMode = Schema.AccessMode.READ_ONLY)
    private Long id;

    @Size(min = 2, max = 100, message = "Name must be between 2 and 100 characters")
    @Schema(description = "Full legal name of the owner",
            example = "João da Silva",
            required = true)
    private String name;

    @Schema(description = "Primary contact email",
            example = "owner@example.com",
            required = true,
            format = "email")
    private String email;

    // Relação com Address (endereço)
    @ManyToOne
    @JoinColumn(name = "address_id", referencedColumnName = "id")  // Cria a coluna address_id
    @Schema(description = "Address of the owner")
    private Address address;

    @OneToMany(mappedBy = "owner", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @Schema(description = "List of phone numbers associated with this owner")
    private Set<Phone> phones = new HashSet<>();

    @OneToMany(mappedBy = "owner", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @Schema(description = "List of goat farms owned by this owner")
    private Set<GoatFarm> goatFarms = new HashSet<>();

}
