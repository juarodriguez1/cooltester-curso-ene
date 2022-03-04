package com.java;

public class Cat {

	public static boolean isCatPlaying(boolean Verano, int Temperatura) {

		if (Verano) {
			if (Temperatura >= 25 && Temperatura <= 45) {
				return true;
			} else {
				return false;
			}
		} else if (Temperatura >= 25 && Temperatura <= 35) {
			return true;
		} else {
			return false;
		}
	}

}
