package com.cognizant.adapterpattern;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.cognizant.adapterpattern.BugattiVeyron;
import com.cognizant.adapterpattern.Movable;
import com.cognizant.adapterpattern.MovableAdapter;
import com.cognizant.adapterpattern.MovableAdapterImpl;

public class Snippet {
	@Test
	public void whenConvertingMPHToKMPH_thenSuccessfullyConverted() {
		Movable bugattiVeyron = new BugattiVeyron();
		MovableAdapter bugattiVeyronAdapter = new MovableAdapterImpl(bugattiVeyron);
		assertEquals(bugattiVeyronAdapter.getSpeed(), 431.30312, 0.00001);
	}
	
	@Test
	public void whenConvertingUSDToEURO_thenSuccessfullyConverted() {
		Movable bugattiVeyron = new BugattiVeyron();
		MovableAdapter bugattiVeyronAdapter = new MovableAdapterImpl(bugattiVeyron);
		assertEquals(bugattiVeyronAdapter.getPrice(), 91.4558, 0.0001);
	}
}
