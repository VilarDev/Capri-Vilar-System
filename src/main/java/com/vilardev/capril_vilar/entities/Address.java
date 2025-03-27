package com.vilardev.capril_vilar.entities;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.*;

@Entity
@Table(name = "addresses")
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Builder
@ToString
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Schema(description = "Entidade que representa um endereço no sistema")
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    @Schema(description = "ID único do endereço",
            example = "1",
            accessMode = Schema.AccessMode.READ_ONLY)
    private Long id;

    @Column(nullable = false, length = 200)
    @NotBlank(message = "O logradouro não pode estar vazio")
    @Size(max = 200, message = "O logradouro deve ter no máximo 200 caracteres")
    @Schema(description = "Nome da rua/avenida com número",
            example = "Av. Paulista, 1000",
            requiredMode = Schema.RequiredMode.REQUIRED)
    private String street;

    @Column(nullable = false, length = 100)
    @NotBlank(message = "A cidade não pode estar vazia")
    @Size(max = 100, message = "A cidade deve ter no máximo 100 caracteres")
    @Schema(description = "Município",
            example = "São Paulo",
            requiredMode = Schema.RequiredMode.REQUIRED)
    private String city;

    @Column(nullable = false, length = 2)
    @NotBlank(message = "O estado não pode estar vazio")
    @Size(min = 2, max = 2, message = "UF deve ter exatamente 2 caracteres")
    @Pattern(regexp = "[A-Z]{2}", message = "UF deve ser sigla válida")
    @Schema(description = "Unidade Federativa (UF)",
            example = "SP",
            requiredMode = Schema.RequiredMode.REQUIRED)
    private String state;

    @Column(name = "postal_code", nullable = false, length = 9)
    @NotBlank(message = "O CEP não pode estar vazio")
    @Pattern(regexp = "\\d{5}-?\\d{3}", message = "CEP deve seguir o formato 00000-000")
    @Schema(description = "Código Postal",
            example = "01310-100",
            requiredMode = Schema.RequiredMode.REQUIRED)
    private String postalCode;

    @Column(nullable = false, length = 50)
    @NotBlank(message = "O país não pode estar vazio")
    @Size(max = 50, message = "O país deve ter no máximo 50 caracteres")
    @Schema(description = "País",
            example = "Brasil",
            defaultValue = "Brasil",
            requiredMode = Schema.RequiredMode.REQUIRED)
    private String country;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "owner_id")
    @Schema(description = "Proprietário associado a este endereço")
    private Owner owner;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "farm_id")
    @Schema(description = "Fazenda associada a este endereço")
    private GoatFarm farm;

}