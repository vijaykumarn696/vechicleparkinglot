package com.example.vechicleparkinglot.models;

import jakarta.persistence.*;

@Entity
@Table(name = "exit_panel")
public class ExitPanel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
}
