package com.example.vechicleparkinglot.models;

import jakarta.persistence.*;

@Entity
@Table(name = "customer_info_portal")
public class CustomerInfoPortal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
}
