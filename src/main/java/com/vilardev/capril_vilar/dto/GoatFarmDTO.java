package com.vilardev.capril_vilar.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED) // Para JPA/Hibernate
@Schema(description = "DTO para representação simplificada de fazendas de cabras")
public class GoatFarmDTO {

    @Schema(
            example = "1",
            description = "ID único da fazenda",
            accessMode = Schema.AccessMode.READ_ONLY
    )
    private Long id;

    @Schema(
            example = "Fazenda Esperança",
            description = "Nome oficial da propriedade",
            required = true,
            maxLength = 100
    )
    private String name;

    @Schema(
            example = "16226",
            description = "Tag de identificação unica para cada Capril (TOD - Tag Oficial Digital)"

    )
    private String tod;
}
