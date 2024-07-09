package com.example.car_registration_tracker.entity;

import lombok.Data;

import jakarta.persistence.*;
import java.time.LocalDate;

@Data
@Entity
@Table(name = "fleet_cars")
public class FleetCar {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long fleetCarId;

    @Column(nullable = false, unique = true)
    private String numberPlate;

    @Column(nullable = false)
    private LocalDate expiryDate;

    @ManyToOne
    @JoinColumn(name = "model_id", nullable = false)
    private CarModel carModel;

    @Column(nullable = false)
    private String driverName;

    @Column(nullable = false, columnDefinition = "boolean default true")
    private Boolean fleetActive = true;
}
