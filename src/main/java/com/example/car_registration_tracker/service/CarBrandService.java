package com.example.car_registration_tracker.service;

import com.example.car_registration_tracker.entity.CarBrand;
import com.example.car_registration_tracker.repository.CarBrandRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarBrandService {

    @Autowired
    private CarBrandRepository carBrandRepository;

    public List<CarBrand> getAllCarBrands() {
        return carBrandRepository.findAll();
    }

}