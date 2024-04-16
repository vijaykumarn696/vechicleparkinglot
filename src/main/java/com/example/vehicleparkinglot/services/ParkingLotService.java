package com.example.vechicleparkinglot.services;

import com.example.vechicleparkinglot.dtos.ParkingFloorDto;
import com.example.vechicleparkinglot.dtos.ParkingLotDto;
import com.example.vechicleparkinglot.models.ParkingFloor;
import com.example.vechicleparkinglot.models.ParkingLot;
import com.example.vechicleparkinglot.repositories.ParkingFloorRepository;
import com.example.vechicleparkinglot.repositories.ParkingLotRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ParkingLotService {

    @Autowired
    private ParkingLotRepository parkingLotRepository;

    public List<ParkingLotDto> getAllParkingLots() {
        return parkingLotRepository.findAll().stream()
                .map(this::convertToDto)
                .collect(Collectors.toList());
    }

    public ParkingLotDto getParkingLot(Long id) {
        ParkingLot parkingLot = parkingLotRepository.findById(id).orElse(null);
        return parkingLot != null ? convertToDto(parkingLot) : null;
    }

    public ParkingLotDto createParkingLot(ParkingLotDto parkingLotDto) {
        ParkingLot parkingLot = parkingLotRepository.save(convertToEntity(parkingLotDto));
        return convertToDto(parkingLot);
    }

    public ParkingLotDto updateParkingLot(Long id, ParkingLotDto parkingLotDto) {
        ParkingLot existingParkingLot = parkingLotRepository.findById(id).orElse(null);
        if (existingParkingLot != null) {
            existingParkingLot.setName(parkingLotDto.getName());
            existingParkingLot.setAddress(parkingLotDto.getAddress());
            return convertToDto(parkingLotRepository.save(existingParkingLot));
        }
        return null;
    }

    public void deleteParkingLot(Long id) {
        parkingLotRepository.deleteById(id);
    }

    private ParkingLotDto convertToDto(ParkingLot parkingLot) {
        ParkingLotDto dto = new ParkingLotDto();
        dto.setId(parkingLot.getId());
        dto.setName(parkingLot.getName());
        dto.setAddress(parkingLot.getAddress());
        return dto;
    }

    private ParkingLot convertToEntity(ParkingLotDto dto) {
        ParkingLot parkingLot = new ParkingLot();
        parkingLot.setName(dto.getName());
        parkingLot.setAddress(dto.getAddress());
        return parkingLot;
    }





//    private ParkingLotRepository parkingLotRepository;
//    private ParkingFloorRepository parkingFloorRepository;
//    public ParkingLotService(ParkingLotRepository parkingLotRepository,ParkingFloorRepository parkingFloorRepository)
//    {
//        this.parkingLotRepository=parkingLotRepository;
//        this.parkingFloorRepository=parkingFloorRepository;
//    }
//    public ParkingLot saveParkingLot(ParkingLotDto parkingLotDto)
//    {
//        ParkingLot parkingLot=new ParkingLot();
//        parkingLot.setName(parkingLotDto.getName());
//        parkingLot.setAddress(parkingLotDto.getAddress());
//        return parkingLotRepository.save(parkingLot);
//    }
//
//    public ParkingFloor addParkingFloor(ParkingFloorDto parkingFloorDto)
//    {
//        ParkingFloor parkingFloor = new ParkingFloor();
//        parkingFloor.setId(parkingFloorDto.getId());
//        parkingFloor.setName(parkingFloorDto.getName());
//
//        ParkingLot parkingLot = parkingLotRepository.findById(parkingFloorDto.getParkingLotId())
//                .orElseThrow(() -> new RuntimeException("ParkingLot not found"));
//        parkingFloor.setParkingLot(parkingLot);
//        return parkingFloorRepository.save(parkingFloor);
//
//    }



}
