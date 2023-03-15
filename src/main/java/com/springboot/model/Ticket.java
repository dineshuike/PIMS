//package com.springboot.model;
//
//import java.util.Date;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//
//import lombok.Data;
//
//@Data
//@Entity
//public class Ticket {
//
//	
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	private int slotNumber;
//	
//	@Id
//	private String vehicleNumber;
//	
//	@Column
//	private Date date;
//	
//	@Column
//	private VehicleType vehicleType;
//
//	public Ticket(int slotNumber, String vehicleNumber, VehicleType vehicleType, Date date) {
//		super();
//		this.slotNumber = slotNumber;
//		this.vehicleNumber = vehicleNumber;
//		this.date = date;
//		this.setVehicleType(vehicleType);
//	}
//
//	public Date getDate() {
//		return date;
//	}
//
//	public void setDate(Date date) {
//		this.date = date;
//	}
//
//	public int getSlotNumber() {
//		return slotNumber;
//	}
//
//	public void setSlotNumber(int slotNumber) {
//		this.slotNumber = slotNumber;
//	}
//
//	public String getVehicleNumber() {
//		return vehicleNumber;
//	}
//
//	public void setVehicleNumber(String vehicleNumber) {
//		this.vehicleNumber = vehicleNumber;
//	}
//
//	public VehicleType getVehicleType() {
//		return vehicleType;
//	}
//
//	public void setVehicleType(VehicleType vehicleType) {
//		this.vehicleType = vehicleType;
//	}
//
//	@Override
//	public String toString() {
//		return "Ticket [slotNumber=" + slotNumber + ", vehicleNumber=" + vehicleNumber + ", date=" + date
//				+ ", vehicleType=" + vehicleType + "]";
//	}
//}
