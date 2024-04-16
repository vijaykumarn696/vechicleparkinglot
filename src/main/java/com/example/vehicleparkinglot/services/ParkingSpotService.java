package com.example.vechicleparkinglot.services;

import com.example.vechicleparkinglot.models.ParkingSpot;
import com.example.vechicleparkinglot.repositories.ParkingSpotRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ParkingSpotService {
    @Autowired
    private ParkingSpotRepository parkingSpotRepository;

    public List<ParkingSpot> getAllParkingSpots() {
        return parkingSpotRepository.findAll();
    }

    public ParkingSpot getParkingSpot(Long id) {
        return parkingSpotRepository.findById(id).orElse(null);
    }

    public ParkingSpot createParkingSpot(ParkingSpot parkingSpot) {
        return parkingSpotRepository.save(parkingSpot);
    }

    public ParkingSpot updateParkingSpot(Long id, ParkingSpot parkingSpot) {
        ParkingSpot existingParkingSpot = parkingSpotRepository.findById(id).orElse(null);
        if (existingParkingSpot != null) {
            existingParkingSpot.setSpotType(parkingSpot.getSpotType());
            existingParkingSpot.setFree(parkingSpot.isFree());
            existingParkingSpot.setParkingFloor(parkingSpot.getParkingFloor());
            existingParkingSpot.setVehicle(parkingSpot.getVehicle());
            return parkingSpotRepository.save(existingParkingSpot);
        }
        return null;
    }

    public void deleteParkingSpot(Long id) {
        parkingSpotRepository.deleteById(id);
    }
}
