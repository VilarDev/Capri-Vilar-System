package com.vilardev.capril_vilar.entities;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.*;

@Entity
@Table(name = "phones")
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Builder
@ToString
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Schema(description = "Entity representing a phone number in the system")
public class Phone {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    @Schema(description = "Unique identifier of the phone record",
            example = "1",
            accessMode = Schema.AccessMode.READ_ONLY)
    private Long id;

    @Pattern(regexp = "^[\\+]?[(]?[0-9]{3}[)]?[-\\s\\.]?[0-9]{3}[-\\s\\.]?[0-9]{4,6}$",
            message = "Invalid phone number format")
    @Schema(description = "Full phone number with country code",
            example = "+5511999999999",
            required = true,
            pattern = "^[\\+]?[(]?[0-9]{3}[)]?[-\\s\\.]?[0-9]{3}[-\\s\\.]?[0-9]{4,6}$")
    private String number;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "owner_id", nullable = false)
    @Schema(description = "Owner associated with this phone number")
    private Owner owner;

    @Schema(description = "Flag indicating if this is the primary contact number",
            example = "false")
    private boolean primary;
}