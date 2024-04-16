package com.example.vechicleparkinglot.repositories;

import com.example.vechicleparkinglot.models.ParkingSpot;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ParkingSpotRepository extends JpaRepository<ParkingSpot,Long> {
}
