package com.java;

public class Decimales {

	public static boolean areEqualByThreeDecimalPlaces(double x, double y) {
	
		
		x = x*1000;
		y = y*1000;
		
		x = (int) x;
		y = (int) y;
		
		if (x==y) {
			return true;
			}else {
			return false;
		}
		
	}
}
