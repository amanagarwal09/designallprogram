package com.cognizant.test;

import java.util.Scanner;

import com.cognizant.abs.Factory;
import com.cognizant.abs.Headlight;
import com.cognizant.abs.Tire;
import com.cognizant.absimpl.AudiFactory;
import com.cognizant.absimpl.MercedesFactory;

public class Client {
	public static void main(String[] args) {
		int choice = 1;
		Factory factory;
		Scanner scanner = new Scanner(System.in);
		while (choice == 1) {
			System.out.println("Do you want to choose Audi or Mercedes ?");
			String car = scanner.nextLine();
			if(car.equalsIgnoreCase("audi")) {
				factory = new AudiFactory();
				Headlight headlight = factory.makeHeadlight();
				Tire tire = factory.makeTire();
				headlight.headLight();
				tire.tire();
			}else if(car.equalsIgnoreCase("mercedes")) {
				factory = new MercedesFactory();
				Headlight headlight = factory.makeHeadlight();
				Tire tire = factory.makeTire();
				headlight.headLight();
				tire.tire();
			}else {
				System.out.println("Wrong");
				main(args);
			}
			System.out.println("Press 1 to Browse Car ?");
			choice = Integer.parseInt(scanner.nextLine());
			if(choice!=1) {
				System.out.println("Bye Bye!");
				System.exit(0);
			}
		}
		scanner.close();
	}
}
