package com.cognizant.test;

import java.util.Scanner;

import com.cognizant.impl.PhoneOrder;
import com.cognizant.impl.PhoneRepair;
import com.cognizant.impl.ProcessPhoneRepair;
import com.cognizant.impl.Redmi7;
import com.cognizant.impl.SamsungNote;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Welcome to our site. Would you like to order or repair?");
		String processOption = scanner.nextLine();
		PhoneRepair phoneRepair = new PhoneRepair();
		PhoneOrder phoneOrder = new PhoneOrder();
		ProcessPhoneRepair processPhoneRepair = new ProcessPhoneRepair();
		String productDetail = "";
		switch (processOption) {
		case "order":
			System.out.println("Please provide the phone model name");
			productDetail = scanner.nextLine();
			phoneOrder.ProcessOrder(productDetail);
			break;
		case "repair":
			System.out.println("Is it the phone or the accessory that you want to be repaired?");
			String prodcutType = scanner.nextLine().toLowerCase();
			if (prodcutType.equals("phone")) {
				System.out.println("Please provide the phone model name");
				productDetail = scanner.nextLine();
				phoneRepair.ProcessPhoneRepair(productDetail);
				if(productDetail.equalsIgnoreCase("samsungnote")) {
					SamsungNote samsungNote = new SamsungNote();
					processPhoneRepair.repairSteps(samsungNote);
				}else {
					Redmi7 redmi7 = new Redmi7();
					processPhoneRepair.repairSteps(redmi7);
				}
			} else {
				System.out.println("Please provide the accessory detail, like headphone, tempared glass");
				productDetail = scanner.nextLine();
				phoneRepair.ProcessAccessoryRepair(productDetail);
			}
			break;
		default:
			break;
		}
		scanner.close();
	}
}
