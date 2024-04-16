package com.example.vechicleparkinglot.models;

import jakarta.persistence.*;

@Entity
@Table(name = "electric_panel")
public class ElectricPanel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
}
