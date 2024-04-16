package com.example.vechicleparkinglot.models;

import jakarta.persistence.*;

@Entity
@Table(name = "parking_rate")
public class ParkingRate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int hourNumber;
    private double hourlyRate;
}
