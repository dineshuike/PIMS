package com.springboot.model;

import javax.persistence.Column;

public class Slot {
	
	@Column
	private int slotNumber;
	private boolean isEmpty;
	private Vehicle parkVehicle;
	
	public Slot(int slotNumber) {
		this.slotNumber = slotNumber;
		isEmpty = true;
	}

	public int getSlotNumber() {
		return slotNumber;
	}

	public void setSlotNumber(int slotNumber) {
		this.slotNumber = slotNumber;
	}

	public boolean isEmpty() {
		return isEmpty;
	}

	public void setEmpty(boolean isEmpty) {
		this.isEmpty = isEmpty;
	}

	public Vehicle getParkVehicle() {
		return parkVehicle;
	}

	public void setParkVehicle(Vehicle parkVehicle) {
		this.parkVehicle = parkVehicle;
	}
	
	public void vaccentSlot() {
		parkVehicle = null;
		this.isEmpty = true;
			}  
	
	public void occupySlot (Vehicle parkVehicle) {
		this.parkVehicle= parkVehicle;
		this.isEmpty= false;
	}

	
}
