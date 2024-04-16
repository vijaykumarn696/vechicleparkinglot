package com.example.vechicleparkinglot.services;

import com.example.vechicleparkinglot.dtos.ParkingFloorDto;
import com.example.vechicleparkinglot.models.ParkingFloor;
import com.example.vechicleparkinglot.models.ParkingLot;
import com.example.vechicleparkinglot.repositories.ParkingFloorRepository;
import com.example.vechicleparkinglot.repositories.ParkingLotRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ParkingFloorService {

    @Autowired
    private ParkingFloorRepository parkingFloorRepository;

    @Autowired
    private ParkingLotRepository parkingLotRepository;

    public List<ParkingFloorDto> getAllParkingFloors() {
        return parkingFloorRepository.findAll().stream()
                .map(this::convertToDto)
                .collect(Collectors.toList());
    }

    public ParkingFloorDto getParkingFloor(Long id) {
        ParkingFloor parkingFloor = parkingFloorRepository.findById(id).orElse(null);
        return parkingFloor != null ? convertToDto(parkingFloor) : null;
    }

    public ParkingFloorDto createParkingFloor(ParkingFloorDto parkingFloorDto) {
        ParkingFloor parkingFloor = parkingFloorRepository.save(convertToEntity(parkingFloorDto));
        return convertToDto(parkingFloor);
    }

    public ParkingFloorDto updateParkingFloor(Long id, ParkingFloorDto parkingFloorDto) {
        ParkingFloor existingParkingFloor = parkingFloorRepository.findById(id).orElse(null);
        if (existingParkingFloor != null) {
            existingParkingFloor.setName(parkingFloorDto.getName());
            ParkingLot parkingLot = parkingLotRepository.findById(parkingFloorDto.getParkingLotId()).orElse(null);
            if (parkingLot != null) {
                existingParkingFloor.setParkingLot(parkingLot);
            }
            return convertToDto(parkingFloorRepository.save(existingParkingFloor));
        }
        return null;
    }

    public void deleteParkingFloor(Long id) {
        parkingFloorRepository.deleteById(id);
    }

    private ParkingFloorDto convertToDto(ParkingFloor parkingFloor) {
        ParkingFloorDto dto = new ParkingFloorDto();
        dto.setId(parkingFloor.getId());
        dto.setName(parkingFloor.getName());
        dto.setParkingLotId(parkingFloor.getParkingLot().getId());
        return dto;
    }

    private ParkingFloor convertToEntity(ParkingFloorDto dto) {
        ParkingFloor parkingFloor = new ParkingFloor();
        parkingFloor.setName(dto.getName());
        ParkingLot parkingLot = parkingLotRepository.findById(dto.getParkingLotId()).orElse(null);
        if (parkingLot != null) {
            parkingFloor.setParkingLot(parkingLot);
        }
        return parkingFloor;
    }
}
