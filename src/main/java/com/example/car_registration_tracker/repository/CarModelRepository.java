package com.example.car_registration_tracker.repository;

import com.example.car_registration_tracker.entity.CarModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CarModelRepository extends JpaRepository<CarModel, Long> {
    List<CarModel> findByCarBrandBrandId(Long brandId);
}