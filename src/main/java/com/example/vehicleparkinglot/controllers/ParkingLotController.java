package com.example.vechicleparkinglot.controllers;

import com.example.vechicleparkinglot.dtos.ParkingFloorDto;
import com.example.vechicleparkinglot.dtos.ParkingLotDto;
import com.example.vechicleparkinglot.models.ParkingFloor;
import com.example.vechicleparkinglot.models.ParkingLot;
import com.example.vechicleparkinglot.services.ParkingLotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/parkingLot")
public class ParkingLotController {

    @Autowired
    private ParkingLotService parkingLotService;

    @GetMapping
    public List<ParkingLotDto> getAllParkingLots() {
        return parkingLotService.getAllParkingLots();
    }

    @GetMapping("/{id}")
    public ParkingLotDto getParkingLot(@PathVariable Long id) {
        return parkingLotService.getParkingLot(id);
    }

    @PostMapping
    public ParkingLotDto createParkingLot(@RequestBody ParkingLotDto parkingLotDto) {
        return parkingLotService.createParkingLot(parkingLotDto);
    }

    @PutMapping("/{id}")
    public ParkingLotDto updateParkingLot(@PathVariable Long id, @RequestBody ParkingLotDto parkingLotDto) {
        return parkingLotService.updateParkingLot(id, parkingLotDto);
    }

    @DeleteMapping("/{id}")
    public void deleteParkingLot(@PathVariable Long id) {
        parkingLotService.deleteParkingLot(id);
    }




//    @Autowired
//    private ParkingLotService parkingLotService;
//
//    @PostMapping("/addParkingLot")
//    public ParkingLot addParkingLot(@RequestBody ParkingLotDto parkingLotDto) {
//        return parkingLotService.saveParkingLot(parkingLotDto);
//    }
//
//    @PostMapping("/addParkingFloor")
//    public ParkingFloor addParkingFloor(@RequestBody ParkingFloorDto parkingFloorDto) {
//        return parkingLotService.addParkingFloor(parkingFloorDto);
//    }
//


    /*

     @GetMapping
    public List<ParkingLot> getAllParkingLots() {
        return parkingLotRepository.findAll();
    }

    @GetMapping("/{id}")
    public ParkingLot getParkingLot(@PathVariable Long id) {
        return parkingLotRepository.findById(id).orElse(null);
    }

    @PostMapping
    public ParkingLot createParkingLot(@RequestBody ParkingLot parkingLot) {
        return parkingLotRepository.save(parkingLot);
    }

    @PutMapping("/{id}")
    public ParkingLot updateParkingLot(@PathVariable Long id, @RequestBody ParkingLot parkingLot) {
        ParkingLot existingParkingLot = parkingLotRepository.findById(id).orElse(null);
        if (existingParkingLot != null) {
            existingParkingLot.setName(parkingLot.getName());
            existingParkingLot.setAddress(parkingLot.getAddress());
            return parkingLotRepository.save(existingParkingLot);
        }
        return null;
    }

    @DeleteMapping("/{id}")
    public void deleteParkingLot(@PathVariable Long id) {
        parkingLotRepository.deleteById(id);
    }
     */

}
