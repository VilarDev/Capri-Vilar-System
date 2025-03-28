package com.vilardev.capril_vilar.services;

import com.vilardev.capril_vilar.dto.GoatDTO;
import com.vilardev.capril_vilar.entities.Goat;

import com.vilardev.capril_vilar.mappers.GoatMapper;
import com.vilardev.capril_vilar.repositories.GoatRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.NoSuchElementException;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
@Slf4j
public class GoatService {

    private final GoatRepository goatRepository;
    private final GoatMapper goatMapper;

    public GoatDTO getGoatByRegistrationNumber(String registrationNumber) {
        log.debug("Buscando cabra com número de registro: {}", registrationNumber);

        Goat goat = goatRepository.findByRegistrationNumber(registrationNumber)
                .orElseThrow(() -> {
                    log.error("Cabra não encontrada com o número de registro: {}", registrationNumber);
                    return new NoSuchElementException("Cabra não encontrada");
                });

        return goatMapper.toDto(goat);
    }
}