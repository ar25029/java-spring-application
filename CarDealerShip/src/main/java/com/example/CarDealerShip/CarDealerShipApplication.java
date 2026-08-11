package com.example.CarDealerShip;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class CarDealerShipApplication {

	public static void main(String[] args) {
		SpringApplication.run(CarDealerShipApplication.class, args);

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		Car car = null;
		// Take a user input

		Scanner scanner = new Scanner(System.in);
		System.out.println("Hi! Please enter your name: ");
		String name = scanner.nextLine();

		while (true) {

			System.out.println("Enter the choice: \n1. Family Car\n2. Sports Car\n3. Truck");
			int choice = scanner.nextInt();
			switch (choice) {
			case 1 -> {
				System.out.println("Enter the tyre: \n1. Normal Tyre\n2. Sports Tyre");
				int tyreChoice = scanner.nextInt();
				switch (tyreChoice) {
				case 1 -> {
					car = (Car) context.getBean("familyCarWithNormalTyre");
					break;
				}
				case 2 -> {
					car = (Car) context.getBean("familyCarWithSportsTyre");
					break;
				}
				default -> System.out.println("Wrong choice!");
				}
				break;
			}
			case 2 -> {
				car = (Car) context.getBean("sportsCar");
				break;
			}
			case 3 -> {
				car = (Car) context.getBean("truck");
				break;
			}
			case 0 -> {
				System.out.println("Exiting...");
				context.close();
				scanner.close();
				return;
			}
			default -> System.out.println("Wrong choice!");
			}

			car.setOwner(name);
			System.out.println(car.getOwner() + " Owns " + car.getInfo());
		}

	}

}
