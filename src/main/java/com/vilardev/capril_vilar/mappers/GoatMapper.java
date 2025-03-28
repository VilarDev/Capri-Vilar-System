package com.vilardev.capril_vilar.mappers;

import com.vilardev.capril_vilar.dto.GoatDTO;
import com.vilardev.capril_vilar.dto.GoatParentDTO;
import com.vilardev.capril_vilar.entities.Goat;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;
import org.mapstruct.ReportingPolicy;
import org.springframework.stereotype.Component;

@Component
@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface GoatMapper {

    // Mapeamento de Goat para GoatDTO
    @Mapping(target = "parents", source = "goat", qualifiedByName = "mapToParentDTO")
    GoatDTO toDto(Goat goat);

    // Mapeamento de GoatDTO para Goat (Entity)
    @Mapping(target = "father.name", source = "parents.fatherName")
    @Mapping(target = "father.registrationNumber", source = "parents.fatherRegistrationNumber")
    @Mapping(target = "mother.name", source = "parents.motherName")
    @Mapping(target = "mother.registrationNumber", source = "parents.motherRegistrationNumber")
    @Mapping(target = "registrationNumber", source = "registrationNumber")
    @Mapping(target = "name", source = "name")
    @Mapping(target = "breed", source = "breed")
    @Mapping(target = "color", source = "color")
    @Mapping(target = "gender", source = "gender")
    @Mapping(target = "category", source = "category")
    @Mapping(target = "tod", source = "tod")
    @Mapping(target = "toe", source = "toe")
    @Mapping(target = "birthDate", source = "birthDate")
    @Mapping(target = "status", source = "status")
    Goat toEntity(GoatDTO goatDTO);

    // Método para mapear os pais no DTO
    @Named("mapToParentDTO")
    default GoatParentDTO mapToParentDTO(Goat goat) {
        if (goat == null) {
            return null;
        }

        return GoatParentDTO.builder()
                .fatherName(goat.getFather() != null ? goat.getFather().getName() : null)
                .fatherRegistrationNumber(goat.getFather() != null ? goat.getFather().getRegistrationNumber() : null)
                .motherName(goat.getMother() != null ? goat.getMother().getName() : null)
                .motherRegistrationNumber(goat.getMother() != null ? goat.getMother().getRegistrationNumber() : null)
                .build();
    }
}
