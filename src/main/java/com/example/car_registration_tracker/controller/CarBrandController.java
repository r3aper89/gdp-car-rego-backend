package com.example.car_registration_tracker.controller;


import com.example.car_registration_tracker.entity.CarBrand;
import com.example.car_registration_tracker.service.CarBrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/car-brands")
public class CarBrandController {
    
    @Autowired
    private CarBrandService carBrandService;

    @GetMapping
    public List<CarBrand> getAllCarBrands() {
        return carBrandService.getAllCarBrands();
    }
    
    @GetMapping("/{id}")
    public CarBrand getCarBrandById(@PathVariable Long id) {
        return carBrandService.getCarBrandById(id);
    }

}
