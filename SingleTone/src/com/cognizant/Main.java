package com.cognizant;

public class Main {
	public static void main(String[] args) {
		DBConn dbConn0 = DBConn.getInstance();
		DBConn dbConn1 = DBConn.getInstance();
		System.out.println(dbConn0);
		System.out.println(dbConn1);
	}
}
