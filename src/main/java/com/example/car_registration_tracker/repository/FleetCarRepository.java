package com.example.car_registration_tracker.repository;


import com.example.car_registration_tracker.entity.FleetCar;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FleetCarRepository extends JpaRepository<FleetCar, Long> {
    List<FleetCar> findByOrderByExpiryDateAsc();
}