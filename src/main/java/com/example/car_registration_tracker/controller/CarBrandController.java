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

    // return a list of all car brands.
    @GetMapping
    public List<CarBrand> getAllCarBrands() {
        return carBrandService.getAllCarBrands();
    }
    
    // return the car brand with the specified ID.
    @GetMapping("/{id}")
    public CarBrand getCarBrandById(@PathVariable Long id) {
        return carBrandService.getCarBrandById(id);
    }

}
