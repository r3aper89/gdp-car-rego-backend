package com.example.car_registration_tracker.repository;

import com.example.car_registration_tracker.entity.CarBrand;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarBrandRepository extends JpaRepository<CarBrand, Long> {
}