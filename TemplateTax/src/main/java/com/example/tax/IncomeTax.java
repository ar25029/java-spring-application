package com.example.tax;

public class IncomeTax implements Tax {
	
    /*
    1. Create the following attributes.
        a. taxableAmount (double)
        b. taxAmount (double)
        c. isTaxPayed (boolean)
    2. Make this class an implementation of Tax interface and override the interface methods.
    3. Using constructor initialize the isTaxPayed boolean false.
     */
	
	private double taxableAmount;
	private double taxAmount;
	private boolean isTaxPayed;
	
	public IncomeTax() {
		this.isTaxPayed = false;
	}

	@Override
	public void setTaxableAmount(int amount) {
		// TODO Auto-generated method stub
		this.taxableAmount = amount;
	}

	@Override
	public void calculateTaxAmount() {
		double amount = this.taxableAmount;
		taxAmount = 0;
		if(amount >= 1500000) {
		taxAmount = amount * 0.3;
		}
		else if(amount > 1200000) {
			taxAmount = amount * 0.2;
		}
		else if(amount > 900000) {
			taxAmount = amount * 0.15;
		}
		else if(amount>600000) {
			taxAmount = amount * 0.10;
		}
		else if(amount > 300000) {
			taxAmount = amount * 0.05;
		}
		else {
			taxAmount = amount * 0.00;
		}
	}

	@Override
	public double getTaxAmount() {
		// TODO Auto-generated method stub
		return this.taxAmount;
	}

	@Override
	public String getTaxType() {
		// TODO Auto-generated method stub
		return "income";
	}

	@Override
	public boolean isTaxPayed() {
		return this.isTaxPayed;
	}

	@Override
	public void payTax() {
		if(!this.isTaxPayed) {
			this.isTaxPayed = true;
			System.out.println("Hi, your income tax is paid.");
		}
		else {
			System.out.println("Income tax already paid.");
		}
	}

}
