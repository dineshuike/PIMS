//package com.springboot;
//
//import com.springboot.exception.ParkingFullException;
//import com.springboot.model.Ticket;
//import com.springboot.model.Vehicle;
//import com.springboot.model.VehicleType;
//import com.springboot.services.ParkingLot;
//
//public class TestParking {
//
//	public static void main(String[] args) throws ParkingFullException {
//		ParkingLot parkingLot = ParkingLot.getParkingLot();
//
//		parkingLot.initializeParkingSlots(10, 20);
//
//		Vehicle vehicle = new Vehicle("Mh12", VehicleType.TWOWHEELER);
//
//		Ticket ticket = parkingLot.park(vehicle);
//		System.out.println(ticket);
//
//		Vehicle vehicle2 = new Vehicle("Mh13", VehicleType.FOURWHEELER);
//
//		Ticket ticket2 = parkingLot.park(vehicle2);
//		System.out.println(ticket2);
//
//	}
//}
