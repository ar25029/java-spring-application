package com.example.CarDealerShip;

public class FamilyCar implements Car {

	private String ownerName;
	Tyre tyre;

//	public FamilyCar(Tyre tyre) {
//		this.tyre = tyre;
//	}

	public void setTyre(Tyre tyre) {
		this.tyre = tyre;
	}

	@Override
	public String getInfo() {
		return "A Family Car" + this.tyre.getTyreInfo();
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
