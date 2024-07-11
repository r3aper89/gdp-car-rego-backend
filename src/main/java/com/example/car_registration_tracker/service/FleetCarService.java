package com.example.car_registration_tracker.service;

import com.example.car_registration_tracker.entity.FleetCar;
import com.example.car_registration_tracker.repository.FleetCarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FleetCarService {

    @Autowired
    private FleetCarRepository fleetCarRepository;

    // return a list of all fleet cars ordered by expiry date.
    public List<FleetCar> getAllFleetCars() {
        return fleetCarRepository.findByOrderByExpiryDateAsc();
    }

    // return a list of fleet cars with the specified active status ordered by expiry date.
    public List<FleetCar> getFleetCarsByActiveStatus(boolean activeStatus) {
        return fleetCarRepository.findByFleetActiveOrderByExpiryDateAsc(activeStatus);
    }

    // return the fleet car with the specified ID, or null if not found.
    public FleetCar getFleetCarById(Long id) {
        return fleetCarRepository.findById(id).orElse(null);
    }

    // return the saved fleet car.
    public FleetCar saveFleetCar(FleetCar fleetCar) {
        return fleetCarRepository.save(fleetCar);
    }
}
