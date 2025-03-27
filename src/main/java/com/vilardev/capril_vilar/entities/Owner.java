package com.vilardev.capril_vilar.entities;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.*;

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

    // Optional: Add timestamp fields
    // @CreationTimestamp
    // private LocalDateTime createdAt;

    // Optional: Add relationship
    // @OneToMany(mappedBy = "owner", cascade = CascadeType.ALL)
    // private List<Animal> animals;
}