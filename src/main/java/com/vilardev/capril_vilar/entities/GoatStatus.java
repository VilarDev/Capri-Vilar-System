package com.vilardev.capril_vilar.entities;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema(
        description = "Status que indica a situação do animal no sistema",
        enumAsRef = true
)
public enum GoatStatus {

    @Schema(
            description = "Animal ativo e participando do rebanho",
            example = "ATIVO"
    )
    ATIVO,

    @Schema(
            description = "Animal inativo (vendido, falecido ou removido)",
            example = "INATIVO"
    )
    INATIVO;

    // Método opcional para melhorar a serialização
    @Override
    public String toString() {
        return this.name().charAt(0) + this.name().substring(1).toLowerCase();
    }
}