package com.example.car_registration_tracker.controller;

import com.example.car_registration_tracker.entity.FleetCar;
import com.example.car_registration_tracker.service.FleetCarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/fleet-cars")
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

    // create fleet car
    @PostMapping
    public FleetCar createFleetCar(@RequestBody FleetCar fleetCar) {
        return fleetCarService.saveFleetCar(fleetCar);
    }

    // update update Fleet Car Active Status
    @PutMapping("status/{id}")
    public ResponseEntity&lt;FleetCar&gt; updateFleetCarActiveStatus(@PathVariable Long id, @RequestParam boolean activeStatus) {
        FleetCar updatedFleetCar = fleetCarService.updateFleetCarActiveStatus(id, activeStatus);
        if (updatedFleetCar != null) {
            return ResponseEntity.ok(updatedFleetCar);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

}

//     /api/fleet-cars
// {
//   "fleetCarId": 0,
//   "numberPlate": "b055",
//   "expiryDate": "2030-07-11",
//   "carModel": {
//     "modelId": 2,
//     "modelName": "dd",
//     "carBrand": {
//       "brandId": 1,
//       "brandName": "ss"
//     }
//   },
//   "driverName": "driver",
//   "fleetActive": true
// }

// {
//   "fleetCarId": 16,
//   "numberPlate": "asshole",
//   "expiryDate": "2030-07-11",
//   "carModel": {
//     "modelId": 2,
//     "modelName": "Yaris",
//     "carBrand": {
//       "brandId": 1,
//       "brandName": "Toyota"
//     }
//   },
//   "driverName": "driver",
//   "fleetActive": true
// }

// /api/fleet-cars/

// [
//     {
//         "fleetCarId": 1,
//         "numberPlate": "S123ABC",
//         "expiryDate": "2024-07-08",
//         "carModel": {
//         "modelId": 1,
//         "modelName": "Landcruiser",
//         "carBrand": {
//             "brandId": 1,
//             "brandName": "Toyota"
//         }
//         },
//         "driverName": "Shelton Church",
//         "fleetActive": true
//     },
//     {"fleetCarId": 2, ... },
//     {"fleetCarId": 3, ... },
// ]



// /api/fleet-cars/1'

// {
//   "fleetCarId": 1,
//   "numberPlate": "S123ABC",
//   "expiryDate": "2024-07-08",
//   "carModel": {
//     "modelId": 1,
//     "modelName": "Landcruiser",
//     "carBrand": {
//       "brandId": 1,
//       "brandName": "Toyota"
//     }
//   },
//   "driverName": "Shelton Church",
//   "fleetActive": true
// }


