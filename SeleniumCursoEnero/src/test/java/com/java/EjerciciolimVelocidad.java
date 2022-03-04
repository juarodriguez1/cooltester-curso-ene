package com.java;

public class EjerciciolimVelocidad {

	public static void main(String[] args) {
		/*
		 * Crear un programa que valide el limite de velocidad de un coche cuando vaya
		 * en una carretera, zona escolar o calle normal utilizando estructuras
		 * condicionales con IF
		 */

		int limiteVelocidad = 80; // KM*H
		int velocidadActual = 80; // KM*H
		boolean carretera = true;
		boolean escolar = false;
		boolean calle = false;

		if (carretera) {
			if (velocidadActual <= limiteVelocidad) {
				System.out.println("Su velocidad actual es " + velocidadActual + " menor a la permitida en carretera");
			} else {
				System.out.println("Su velocidad actual es " + velocidadActual + " mayor a la permitida en carretera");
			}

		} else if (escolar) {

			if (velocidadActual <= limiteVelocidad) {
				System.out
						.println("Su velocidad actual es " + velocidadActual + " menor a la permitida en zona escolar");
			} else {
				System.out
						.println("Su velocidad actual es " + velocidadActual + " mayor a la permitida en zona escolar");
			}

		} else if (calle) {
			if (velocidadActual <= limiteVelocidad) {
				System.out.println("Su velocidad actual es " + velocidadActual + " menor a la permitida en calle");
			} else {
				System.out.println("Su velocidad actual es " + velocidadActual + " mayor a la permitida en calle");
			}

		}
	}

}
