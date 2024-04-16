package com.example.vechicleparkinglot.controllers;

import com.example.vechicleparkinglot.dtos.ParkingFloorDto;
import com.example.vechicleparkinglot.services.ParkingFloorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/parkingfloors")
public class ParkingFloorController {

    @Autowired
    private ParkingFloorService parkingFloorService;

    @GetMapping
    public List<ParkingFloorDto> getAllParkingFloors() {
        return parkingFloorService.getAllParkingFloors();
    }

    @GetMapping("/{id}")
    public ParkingFloorDto getParkingFloor(@PathVariable Long id) {
        return parkingFloorService.getParkingFloor(id);
    }

    @PostMapping
    public ParkingFloorDto createParkingFloor(@RequestBody ParkingFloorDto parkingFloorDto) {
        return parkingFloorService.createParkingFloor(parkingFloorDto);
    }

    @PutMapping("/{id}")
    public ParkingFloorDto updateParkingFloor(@PathVariable Long id, @RequestBody ParkingFloorDto parkingFloorDto) {
        return parkingFloorService.updateParkingFloor(id, parkingFloorDto);
    }

    @DeleteMapping("/{id}")
    public void deleteParkingFloor(@PathVariable Long id) {
        parkingFloorService.deleteParkingFloor(id);
    }
}
