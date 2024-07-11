package com.example.car_registration_tracker.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.car_registration_tracker.entity.CarBrand;
import com.example.car_registration_tracker.entity.CarModel;
import com.example.car_registration_tracker.service.CarModelService;
import java.util.List;

@RestController
@RequestMapping("/api/car-models")
public class CarModelController {

    @Autowired
    private CarModelService carModelService;

    //cheat sheet
    // car_models(model_id= 1,2,3) > brand_id = 1, > brandName": "Toyota"
    // car_models(model_id= 4,5) > brand_id = 2, > brandName": "Ford"
    // car_models(model_id= 6,7) > brand_id = 3, > brandName": "Hyundai"

    // return a list of car models associated with the specified car brand.
    @GetMapping("/brand/{brandId}")
    public List<CarModel> getCarModelsByBrandId(@PathVariable Long brandId) {
        return carModelService.getCarModelsByBrandId(brandId);
    }
    // brandId: 3
    //     [
    //   {
    //     "modelId": 6,
    //     "modelName": "i30",
    //     "carBrand": {
    //       "brandId": 3,
    //       "brandName": "Hyundai"
    //     }
    //   },
    //   {
    //     "modelId": 7,
    //     "modelName": "Tucson",
    //     "carBrand": {
    //       "brandId": 3,
    //       "brandName": "Hyundai"
    //     }
    //   }
    // ]

    // return the car model with the specified ID.
    @GetMapping("/{modelId}")
    public CarModel getCarModelById(@PathVariable Long modelId) {
        return carModelService.getCarModelById(modelId);
    }
    // modelId: 7
    // {
    //   "modelId": 7,
    //   "modelName": "Tucson",
    //   "carBrand": {
    //     "brandId": 3,
    //     "brandName": "Hyundai"
    //   }
    // }

    // 
    // return the car brand associated with the specified car model.
    @GetMapping("/{modelId}/brand")
    public CarBrand getCarBrandByModelId(@PathVariable Long modelId) {
        return carModelService.getCarBrandByModelId(modelId);
    }
    // modelId: 4
    // {
    //     "brandId": 2,
    //     "brandName": "Ford"
    // }


}
