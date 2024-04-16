package com.example.vechicleparkinglot.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "parking_spot")
public class ParkingSpot {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String spotType;
    private boolean isFree;
    @ManyToOne
    @JoinColumn(name = "parking_floor_id")
    private ParkingFloor parkingFloor;
    @OneToOne
    private Vehicle vehicle;
}
/*

 statement.execute("CREATE TABLE ParkingLot (id INT AUTO_INCREMENT, name VARCHAR(255), address VARCHAR(255), PRIMARY KEY (id))");
            statement.execute("CREATE TABLE ParkingFloor (id INT AUTO_INCREMENT, parkingLotId INT, PRIMARY KEY (id), FOREIGN KEY (parkingLotId) REFERENCES ParkingLot(id))");
            statement.execute("CREATE TABLE ParkingSpot (id INT AUTO_INCREMENT, type VARCHAR(255), isOccupied BOOLEAN, parkingFloorId INT, PRIMARY KEY (id), FOREIGN KEY (parkingFloorId) REFERENCES ParkingFloor(id))");
            statement.execute("CREATE TABLE Account (id INT AUTO_INCREMENT, type VARCHAR(255), username VARCHAR(255), password VARCHAR(255), PRIMARY KEY (id))");
            statement.execute("CREATE TABLE ParkingTicket (id INT AUTO_INCREMENT, entryTime TIMESTAMP, exitTime TIMESTAMP, charge DECIMAL(10, 2), isPaid BOOLEAN, parkingSpotId INT, vehicleId INT, PRIMARY KEY (id), FOREIGN KEY (parkingSpotId) REFERENCES ParkingSpot(id), FOREIGN KEY (vehicleId) REFERENCES Vehicle(id))");
            statement.execute("CREATE TABLE Vehicle (id INT AUTO_INCREMENT, type VARCHAR(255), PRIMARY KEY (id))");
            statement.execute("CREATE TABLE EntrancePanel (id INT AUTO_INCREMENT, parkingLotId INT, PRIMARY KEY (id), FOREIGN KEY (parkingLotId) REFERENCES ParkingLot(id))");
            statement.execute("CREATE TABLE ExitPanel (id INT AUTO_INCREMENT, parkingLotId INT, PRIMARY KEY (id), FOREIGN KEY (parkingLotId) REFERENCES ParkingLot(id))");
            statement.execute("CREATE TABLE Payment (id INT AUTO_INCREMENT, type VARCHAR(255), amount DECIMAL(10, 2), ticketId INT, PRIMARY KEY (id), FOREIGN KEY (ticketId) REFERENCES ParkingTicket(id))");
            statement.execute("CREATE TABLE ParkingRate (id INT AUTO_INCREMENT, firstHourRate DECIMAL(10, 2), secondHourRate DECIMAL(10, 2), thirdHourRate DECIMAL(10, 2), remainingHoursRate DECIMAL(10, 2), PRIMARY KEY (id))");
            statement.execute("CREATE TABLE ParkingDisplayBoard (id INT AUTO_INCREMENT, message VARCHAR(255), parkingFloorId INT, PRIMARY KEY (id), FOREIGN KEY (parkingFloorId) REFERENCES ParkingFloor(id))");
            statement.execute("CREATE TABLE ParkingAttendantPortal (id INT AUTO_INCREMENT, accountId INT, PRIMARY KEY (id), FOREIGN KEY (accountId) REFERENCES Account(id))");
            statement.execute("CREATE TABLE CustomerInfoPortal (id INT AUTO_INCREMENT, ticketId INT, PRIMARY KEY (id), FOREIGN KEY (ticketId) REFERENCES ParkingTicket(id))");
            statement.execute("CREATE TABLE ElectricPanel (id INT AUTO_INCREMENT, parkingSpotId INT, PRIMARY KEY (id), FOREIGN KEY (parkingSpotId) REFERENCES ParkingSpot(id))");


 */
