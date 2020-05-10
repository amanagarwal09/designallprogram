package com.cognizant.absimpl;

import com.cognizant.abs.Factory;
import com.cognizant.abs.Headlight;
import com.cognizant.abs.Tire;

public class MercedesFactory extends Factory{

	@Override
	public Headlight makeHeadlight() {
		return new MercedesHeadlight();
	}

	@Override
	public Tire makeTire() {
		return new MercedesTire();
	}

}
