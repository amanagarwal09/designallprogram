package com.cognizant.impl;

import com.cognizant.interfaces.IPhone;

public class Redmi7 implements IPhone {

	@Override
	public String GetPhonePart1() {
		return "display";
	}

	@Override
	public double GetPart1Cost() {
		return 500;
	}

}
