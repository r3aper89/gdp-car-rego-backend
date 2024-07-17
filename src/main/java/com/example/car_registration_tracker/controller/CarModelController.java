package com.example.car_registration_tracker.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.car_registration_tracker.entity.CarBrand;
import com.example.car_registration_tracker.entity.CarModel;
import com.example.car_registration_tracker.service.CarModelService;
import java.util.List;

@RestController
@RequestMapping("/api/car-models")
@CrossOrigin(origins = "http://localhost:4200")
public class CarModelController {

    @Autowired
    private CarModelService carModelService;

    // return a list of car models associated with the specified car brand.
    @GetMapping("/brand/{brandId}")
    public List<CarModel> getCarModelsByBrandId(@PathVariable Long brandId) {
        return carModelService.getCarModelsByBrandId(brandId);
    }

    // return the car model with the specified ID.
    @GetMapping("/{modelId}")
    public CarModel getCarModelById(@PathVariable Long modelId) {
        return carModelService.getCarModelById(modelId);
    }
    
    // return the car brand associated with the specified car model.
    @GetMapping("/{modelId}/brand")
    public CarBrand getCarBrandByModelId(@PathVariable Long modelId) {
        return carModelService.getCarBrandByModelId(modelId);
    }
    

}
