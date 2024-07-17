package com.example.car_registration_tracker.controller;

import com.example.car_registration_tracker.dto.FleetCarUpdateRequest;
import com.example.car_registration_tracker.entity.FleetCar;
import com.example.car_registration_tracker.service.FleetCarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/fleet-cars")
@CrossOrigin(origins = "http://localhost:4200") //allow incoming requests from angular 
public class FleetCarController {

    @Autowired
    private FleetCarService fleetCarService;

    // return a list of all fleet cars ordered by expiry date.
    @GetMapping
    public List<FleetCar> getAllFleetCars() {
        return fleetCarService.getAllFleetCars();
    }

    // return a list of all active fleet cars.
    @GetMapping("/active")
    public List<FleetCar> getActiveFleetCars() {
        return fleetCarService.getFleetCarsByActiveStatus(true);
    }

    // return a list of all inactive fleet cars.
    @GetMapping("/inactive")
    public List<FleetCar> getInactiveFleetCars() {
        return fleetCarService.getFleetCarsByActiveStatus(false);
    }

    // return the fleet car with the specified ID.
    @GetMapping("/{id}")
    public ResponseEntity<FleetCar> getFleetCarById(@PathVariable Long id) {
        FleetCar fleetCar = fleetCarService.getFleetCarById(id);
        return ResponseEntity.ok(fleetCar);
    }


    // Update license plate and expiry date
    @PutMapping("/{id}/license-plate-and-expiry-date")
    public ResponseEntity<FleetCar> updateFleetCarLicensePlateAndExpiryDate(
            @PathVariable Long id,
            @RequestBody FleetCarUpdateRequest updateRequest) {
        FleetCar updatedFleetCar = fleetCarService.updateFleetCarLicensePlateAndExpiryDate(
                id, updateRequest.getNumberPlate(), updateRequest.getExpiryDate());
        if (updatedFleetCar != null) {
            return ResponseEntity.ok(updatedFleetCar);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    // Update active status
    @PutMapping("/{id}/active-status")
    public ResponseEntity<FleetCar> updateFleetCarActiveStatus(
            @PathVariable Long id,
            @RequestParam boolean activeStatus) {
        FleetCar updatedFleetCar = fleetCarService.updateFleetCarActiveStatus(id, activeStatus);
        if (updatedFleetCar != null) {
            return ResponseEntity.ok(updatedFleetCar);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
// @RequestBody: 
// HttpRequest body onto a Java object
// https://www.baeldung.com/spring-request-response-body

//@RequestParam
//  extract query parameters, form parameters, and even files from the request.
// https://www.baeldung.com/spring-request-param

// @PathVariable
// 
// https://www.baeldung.com/spring-pathvariable