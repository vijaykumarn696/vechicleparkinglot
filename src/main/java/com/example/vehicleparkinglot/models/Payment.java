package com.example.vechicleparkinglot.models;

import jakarta.persistence.*;

@Entity
@Table(name = "payment")
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private double amount;
    private String paymentType;
    private String paymentStatus;
    @OneToOne
    @JoinColumn(name = "parking_ticket_id")
    private ParkingTicket parkingTicket;
}
