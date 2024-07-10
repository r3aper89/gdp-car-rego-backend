package com.example.car_registration_tracker.entity;

import lombok.Data;
import jakarta.persistence.*;

@Data
@Entity
@Table(name = "car_models")
public class CarModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long modelId;

    @Column(nullable = false)
    private String modelName;

    @ManyToOne
    @JoinColumn(name = "brand_id", nullable = false)
    private CarBrand carBrand;
}
