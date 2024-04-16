package com.example.vechicleparkinglot.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class VehicleDto {
    private Long id;
    private String licenseNumber;
    private String vehicleType;
    private Long parkingSpotId;
    private Long parkingTicketId;
}
