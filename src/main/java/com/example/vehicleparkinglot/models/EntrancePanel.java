package com.example.vechicleparkinglot.models;

import jakarta.persistence.*;

@Entity
@Table(name = "entrance_panel")
public class EntrancePanel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
}
