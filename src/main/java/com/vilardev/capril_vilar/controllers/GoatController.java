package com.vilardev.capril_vilar.controllers;

import com.vilardev.capril_vilar.dto.GoatDTO;
import com.vilardev.capril_vilar.services.GoatService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/goats")
@RequiredArgsConstructor
public class GoatController {

    private final GoatService goatService;

    @GetMapping("/{registrationNumber}")
    @Operation(summary = "Recupera uma cabra pelo número de registro", description = "Busca uma cabra com base no número de registro único.")
    public ResponseEntity<GoatDTO> getGoatByRegistrationNumber(
            @Valid @Parameter(description = "Número de registro da cabra", required = true)
            @PathVariable String registrationNumber) {

        GoatDTO goatDTO = goatService.getGoatByRegistrationNumber(registrationNumber);
        if (goatDTO == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(goatDTO);
    }
}
