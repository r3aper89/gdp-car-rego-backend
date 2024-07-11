package com.example.car_registration_tracker.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.car_registration_tracker.entity.CarBrand;
import com.example.car_registration_tracker.entity.CarModel;
import com.example.car_registration_tracker.repository.CarModelRepository;
import java.util.List;


@Service
public class CarModelService {

    @Autowired
    private CarModelRepository carModelRepository;

    // return list of car models associated with the specified car brand.
    public List<CarModel> getCarModelsByBrandId(Long brandId) {
        return carModelRepository.findByCarBrandBrandId(brandId);
    }

    // return the car model with the specified ID, or null if not found.
    public CarModel getCarModelById(Long id) {
        return carModelRepository.findById(id).orElse(null);
    }

    // return the car brand associated with the specified car model, or null if not found.
    public CarBrand getCarBrandByModelId(Long modelId) {
        CarModel carModel = carModelRepository.findById(modelId).orElse(null);
        return carModel != null ? carModel.getCarBrand() : null;
    }

}
