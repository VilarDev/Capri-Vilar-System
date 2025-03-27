package com.vilardev.capril_vilar.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PRIVATE) // Para JPA/Hibernate
@Schema(description = "DTO para representar um proprietário (Owner) em requisições e respostas da API")
public class OwnerDTO {

    @Schema(example = "1", description = "ID único do proprietário", accessMode = Schema.AccessMode.READ_ONLY)
    private Long id;

    @Schema(example = "João Silva", description = "Nome completo do proprietário", required = true)
    private String name;

    @Schema(example = "joao@exemplo.com", description = "E-mail do proprietário", required = true)
    private String email;
}
