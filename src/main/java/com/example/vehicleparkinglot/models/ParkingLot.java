package com.example.vechicleparkinglot.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "parking_lot")
public class ParkingLot {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String address;
    // Each parking lot has many parking floors.
    @OneToMany(mappedBy = "parkingLot")
    private List<ParkingFloor> parkingFloors;
}
