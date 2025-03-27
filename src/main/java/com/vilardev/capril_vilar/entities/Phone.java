package com.vilardev.capril_vilar.entities;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;


@Entity
@Table(name = "phones")
@Getter @Setter
@AllArgsConstructor
@Schema(description = "Entity representing a phone number in the system")
public class Phone {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Schema(description = "Unique identifier of the phone record",
            example = "1",
            accessMode = Schema.AccessMode.READ_ONLY)
    private Long id;

    @Column(nullable = false, length = 20)
    @Pattern(regexp = "^[\\+]?[(]?[0-9]{3}[)]?[-\\s\\.]?[0-9]{3}[-\\s\\.]?[0-9]{4,6}$",
            message = "Invalid phone number format")
    @Schema(description = "Full phone number with country code",
            example = "+5511999999999",
            requiredMode = Schema.RequiredMode.REQUIRED)
    private String number;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "owner_id")
    @Schema(description = "Owner associated with this phone number")
    private Owner owner;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "goat_farm_id")
    @Schema(description = "Goat farm associated with this phone number")
    private GoatFarm goatFarm;

    public Phone() {
    }

}