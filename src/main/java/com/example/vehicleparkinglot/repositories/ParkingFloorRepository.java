package com.example.vechicleparkinglot.repositories;

import com.example.vechicleparkinglot.models.ParkingFloor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ParkingFloorRepository extends JpaRepository<ParkingFloor,Long> {
}
