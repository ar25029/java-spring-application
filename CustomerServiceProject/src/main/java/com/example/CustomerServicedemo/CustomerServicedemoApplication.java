package com.example.CustomerServicedemo;

import java.util.Scanner;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.Customers.CustomerCare;

@SpringBootApplication
public class CustomerServicedemoApplication {

	public static void main(String[] args) {

		/*
		You need to complete this application as mentioned in the problem 
		statement build your own logic and perform the following tasks.

			 Tasks:
		 *  1. Load the beans from ApplicationContext.xml
		 *  2. Display all the departments available and get the input from user.
		 *  3. Get the message from user and store it into the respective department.
		 *  
		 */
		Scanner sc = new Scanner(System.in);

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		CustomerCare customerCare = null;
		String department = null;
		System.out.println("Welcome to customer care application.");
		System.out.println("Please enter yuor name: ");
		String customerName = sc.nextLine();
		System.out.println("Thanks for reaching us!");
		while(true) {
			System.out.println("Please select the department to connect to:\n1. Payement Department\n2. Query Department\n3. Sales Department");
			int customerChoice = sc.nextInt();
			if(customerChoice>0 && customerChoice<4) {
				switch (customerChoice) {
				case 1 -> department = "paymentDepartment";
				case 2 -> department = "queryDepartment";
				case 3 -> department = "salesDepartment";
				default -> System.out.println("Invalid Choice!");					
				}
				customerCare = (CustomerCare)context.getBean(department);
				customerCare.setCustomerName(customerName);
				customerCare.getService();
				sc.nextLine();
				String issue = sc.nextLine();
				customerCare.setProblem(issue);
				customerCare.getProblem();			
			}
			else {
				System.out.println("Exiting...");
				context.close();
				sc.close();
				return;
			}
		}

	}
}
