package com.cognizant.test;

import java.util.Scanner;

import com.cognizant.impl.PhoneOrder;
import com.cognizant.impl.PhoneOrderRepair;
import com.cognizant.impl.PhoneRepair;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Welcome to our site. Would you like to order or repair?");
		String processOption = scanner.nextLine();
		PhoneOrder phoneOrder = new PhoneOrder();
		PhoneRepair phonerepair = new PhoneRepair();
		// one object for repair and one for order
		
	    PhoneOrderRepair phoneOrderRepair = new PhoneOrderRepair();
		  // object for both repair and order
		
		String productDetail = "";
		String accessorydetail = "";
		switch (processOption) {
		case "order":
			System.out.println("Please provide the phone model name");
			productDetail = scanner.nextLine();
			phoneOrder.ProcessOrder(productDetail);
			break;
		case "repair":
			System.out.println("Is it the phone or the accessory or the both that you want to be repaired?");
			String prodcutType = scanner.nextLine().toLowerCase();
			if (prodcutType.equals("phone")) {
				System.out.println("Please provide the phone model name");
				productDetail = scanner.nextLine();
				phonerepair.ProcessPhoneRepair(productDetail);
			} else if(prodcutType.equals("accessory"))  {
				System.out.println("Please provide the accessory detail, like headphone, tempared glass");
				productDetail = scanner.nextLine();
				phonerepair.ProcessAccessoryRepair(productDetail);
			}
			else
			{
				System.out.println("Please provide the phone model name and the accessory detail, like headphone, tempared glass");
				productDetail = scanner.nextLine();
				accessorydetail = scanner.nextLine();
				phonerepair.ProcessPhoneRepair(productDetail);
				phonerepair.ProcessAccessoryRepair(accessorydetail);
			}
			break;
			default:
			break;
		}
		scanner.close();
	}
}
