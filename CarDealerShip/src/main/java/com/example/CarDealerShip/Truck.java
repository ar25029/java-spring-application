package com.example.CarDealerShip;

public class Truck implements Car {

	private String ownerName;
	private Tyre tyre = null;

	public Truck(Tyre tyre) {
		this.tyre = tyre;
	}

	@Override
	public String getInfo() {
		return "A Truck" + this.tyre.getTyreInfo();
	}

	@Override
	public void setOwner(String name) {
		this.ownerName = name;
	}

	@Override
	public String getOwner() {
		return this.ownerName;
	}

}
