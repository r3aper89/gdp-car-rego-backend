package com.example.car_registration_tracker.dto;

import lombok.Data;

import java.time.LocalDate;

@Data
public class FleetCarUpdateRequest {
    private String numberPlate;
    private LocalDate expiryDate;
    private Long carModelId;
    private String driverName;
    private Boolean fleetActive;
}
