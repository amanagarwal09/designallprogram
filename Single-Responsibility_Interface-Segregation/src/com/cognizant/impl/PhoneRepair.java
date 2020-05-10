package com.cognizant.impl;

import com.cognizant.interfaces.IAccessoryRepair;
import com.cognizant.interfaces.IRepair;

public class PhoneRepair implements IRepair, IAccessoryRepair {
	@Override
	public void ProcessPhoneRepair(String modelName) {
		System.out.println(modelName + " repair accepted!");
	}

	@Override
	public void ProcessAccessoryRepair(String accessoryType) {
		System.out.println(accessoryType + " repair accepted!");
	}
}
