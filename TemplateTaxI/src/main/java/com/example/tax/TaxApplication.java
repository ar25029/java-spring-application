package com.example.tax;
import java.util.Scanner;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class TaxApplication {

	public static void main(String[] args) {
				
		Scanner sc = new Scanner(System.in);
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		while(true) {
			System.out.println("Select you choice to calculate tax: ");
			int type = sc.nextInt();
			String taxType = "";
			switch (type) {
				case 1:
					taxType = "income";
					break;
				case 2:
					taxType = "property";
					break;
				case 3:
					System.out.println("Exiting...");
					context.close();
					sc.close();
					return;
				default:
					System.out.println("Wrong inout!");
			}
			
			Tax tax = taxType.equals("income") ? (Tax)context.getBean("incomeTax"):(Tax)context.getBean("propertyTax");
			System.out.println(tax.getTaxType());
			
			/**
			 Follow the below steps to complete the application:

			    Step 1: Check if the user has paid the tax already, if yes then print the below message on console:

				    "You have already paid Income/Property(get this getTaxType() interface method) tax."

				Step 2: If the user has not paid tax then do the following:

					- Take the input of income/property value from the user based on the choice made & set this
			          amount using setTaxableAmount() interface method.

			 	    - Finally calculate the taxAmount using calculateTaxAmount() interface method & ask user if
			          he wants to pay the tax, if yes call then call payTax() method.
			**/
			
			if(tax.isTaxPayed()) {
				System.out.println("You have already payed income tax.");
			}
			else {
				System.out.println("Do you want to pay tax: \n1. Yes \n2. Exit");
				int checkPay = sc.nextInt();
				if(checkPay==1) {
					System.out.println("Enter the amount");
					int amount = sc.nextInt();
					tax.setTaxableAmount(amount);
					tax.calculateTaxAmount();
					System.out.println("You have selected "+tax.getTaxType()+" and your total tax amount is "+tax.getTaxAmount());
					tax.payTax();
				}
				else {
					return;
				}
			}
		
		}
	}

}
