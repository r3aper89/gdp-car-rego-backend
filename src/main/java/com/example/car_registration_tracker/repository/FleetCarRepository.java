package com.example.car_registration_tracker.repository;

import com.example.car_registration_tracker.entity.FleetCar;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FleetCarRepository extends JpaRepository<FleetCar, Long> {
    // findBy OrderBy ExpiryDate Asc
    List<FleetCar> findByOrderByExpiryDateAsc();
    // findBy FleetActive OrderBy ExpiryDate Asc
    List<FleetCar> findByFleetActiveOrderByExpiryDateAsc(boolean fleetActive);
}
// Query Creation
// findBy: https://docs.spring.io/spring-data/jpa/reference/repositories/query-methods-details.html#repositories.query-methods.query-creation
// OrderBy: https://docs.spring.io/spring-data/jpa/reference/jpa/query-methods.html