package com.cognizant.impl;

import com.cognizant.interfaces.IAccessoryRepair;
import com.cognizant.interfaces.IOrder;
import com.cognizant.interfaces.IRepair;

public class PhoneOrderRepair implements IOrder, IRepair, IAccessoryRepair {
	@Override
	public void ProcessOrder(String modelName) {
		System.out.println(modelName + " order accepted!");
	}

	@Override
	public void ProcessPhoneRepair(String modelName) {
		System.out.println(modelName + " repair accepted!");
	}

	@Override
	public void ProcessAccessoryRepair(String accessoryType) {
		System.out.println(accessoryType + " repair accepted!");
	}
}