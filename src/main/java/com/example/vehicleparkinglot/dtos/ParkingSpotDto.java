package com.example.vechicleparkinglot.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ParkingSpotDto {
    private Long id;
    private String spotType;
    private boolean isFree;
    private Long parkingFloorId;
}
/*
import javax.persistence.*;
import java.util.List;

@Entity
public class ParkingLot {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String address;

    @OneToMany(mappedBy = "parkingLot")
    private List<ParkingFloor> parkingFloors;
}

@Entity
public class ParkingFloor {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "parking_lot_id")
    private ParkingLot parkingLot;

    @OneToMany(mappedBy = "parkingFloor")
    private List<ParkingSpot> parkingSpots;

    @OneToOne
    private ParkingDisplayBoard parkingDisplayBoard;
}

@Entity
public class ParkingSpot {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String type; // Handicapped, Compact, Large, Motorcycle, Electric
    private Boolean isOccupied;

    @ManyToOne
    @JoinColumn(name = "parking_floor_id")
    private ParkingFloor parkingFloor;

    @OneToOne
    private Vehicle vehicle;
}

@Entity
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String type; // Admin or Parking Attendant
    // other attributes...
}

@Entity
public class ParkingTicket {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String ticketNumber;

    @OneToOne
    private Vehicle vehicle;
}

@Entity
public class Vehicle {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String type; // Car, Truck, Electric, Van, Motorcycle

    @OneToOne(mappedBy = "vehicle")
    private ParkingSpot parkingSpot;
}

@Entity
public class EntrancePanel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    // other attributes...
}

@Entity
public class ExitPanel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    // other attributes...
}

@Entity
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String paymentType; // Credit Card or Cash

    @OneToOne
    private ParkingTicket parkingTicket;
}

@Entity
public class ParkingRate {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Double hourlyRate;
    // other attributes...
}

@Entity
public class ParkingDisplayBoard {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    // other attributes...
}

@Entity
public class ParkingAttendantPortal {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    // other attributes...
}

@Entity
public class CustomerInfoPortal {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    // other attributes...
}

@Entity
public class ElectricPanel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    // other attributes...
}

 */
