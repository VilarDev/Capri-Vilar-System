package com.vilardev.capril_vilar.repositories;

import com.vilardev.capril_vilar.entities.Goat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface GoatRepository extends JpaRepository<Goat, String> {
   Optional<Goat> findByRegistrationNumber(String registrationNumber);
}
