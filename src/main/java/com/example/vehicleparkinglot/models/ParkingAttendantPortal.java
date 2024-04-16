package com.example.vechicleparkinglot.models;

import jakarta.persistence.*;

@Entity
@Table(name = "parking_attendant_portal")
public class ParkingAttendantPortal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
}
