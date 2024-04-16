package com.example.vechicleparkinglot.models;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "parking_ticket")
public class ParkingTicket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDateTime issueTime;
    private LocalDateTime payTime;
    private double payiedAmount;
    private boolean isPaid;
    @OneToOne
    @JoinColumn(name = "vehicle_id")
    private Vehicle vehicle;
}
