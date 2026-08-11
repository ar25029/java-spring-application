package com.example.CarDealerShip;

public class SportCar implements Car {

	private String ownerName;
	private Tyre tyre = null;

	public SportCar(Tyre tyre) {
		this.tyre = tyre;
	}

	@Override
	public String getInfo() {
		return "A Sport Car" + this.tyre.getTyreInfo();
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
