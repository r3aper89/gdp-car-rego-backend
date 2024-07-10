package com.example.car_registration_tracker.entity;

import lombok.Data;

import jakarta.persistence.*;


@Data
@Entity
@Table(name = "car_brands")
public class CarBrand {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long brandId;

    @Column(nullable = false, unique = true)
    private String brandName;
    
}
