package com.example.vechicleparkinglot.models;

import jakarta.persistence.*;

@Entity
@Table(name = "parking_display_board")
public class ParkingDisplayBoard {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "parking_floor_id")
    private ParkingFloor parkingFloor;
}
