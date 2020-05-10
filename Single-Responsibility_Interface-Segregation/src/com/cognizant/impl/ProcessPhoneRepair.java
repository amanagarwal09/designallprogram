package com.cognizant.impl;

import com.cognizant.interfaces.IPhone;

public class ProcessPhoneRepair {
	public void repairSteps(IPhone iPhone) {
		System.out.println(iPhone.GetPhonePart1()+" repaired");
		System.out.println((iPhone.GetPart1Cost() * 0.5) +" partCost");
	}
}
