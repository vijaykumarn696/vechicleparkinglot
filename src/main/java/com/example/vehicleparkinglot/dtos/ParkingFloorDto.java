package com.example.vechicleparkinglot.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ParkingFloorDto {
    private Long id;
    private String name;
    private Long parkingLotId;
}
