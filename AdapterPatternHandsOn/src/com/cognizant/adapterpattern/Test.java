package com.cognizant.adapterpattern;

public class Test {
	public static void main(String[] args) {
		Movable bugattiVeyron = new BugattiVeyron();
		MovableAdapter bugattiVeyronAdapter = new MovableAdapterImpl(bugattiVeyron);
		System.out.println(String.format("%.0f", bugattiVeyron.getSpeed()) + " to "+String.format("%.0f", bugattiVeyronAdapter.getSpeed()) + " km/h");
		System.out.println(String.format("%.0f", bugattiVeyron.getPrice()) + " to "+String.format("%.0f", bugattiVeyronAdapter.getPrice()) + " EURO");
	}
}