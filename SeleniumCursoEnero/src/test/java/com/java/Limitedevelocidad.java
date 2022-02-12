package com.java;

public class Limitedevelocidad {

	public static void main(String[] args) {
		/* Automovil conduciendo en exceso de velocidad
		 * 
		 */

		int limiteVelocidad = 80; //km/h
		int velocidadActual = 100; //km/h
		boolean carretera = false; //KM/H
		
//		if (velocidadActual >limiteVelocidad) {
	//		System.out.println("MULTA");
	//	}else {
	//		System.out.println("DESCUENTO");
	//   }
		
		
		
	//	if (carretera) {
			
	//	limiteVelocidad = 100; //km/h
		
	//	if (velocidadActual >limiteVelocidad) {
	//		System.out.println("MULTA");
	//	}else {
	//		System.out.println("DESCUENTO");
	 //   }
		
		
			if (carretera) {
		
			limiteVelocidad = 100; //km/h
			
			if (velocidadActual > limiteVelocidad) {
					System.out.println("MULTA - VAS EN CARRETERA");
			}else {
					System.out.println("DESCUENTO - VAS EN CARRETERA");
			}
			
			}else if (velocidadActual > limiteVelocidad) {
						System.out.println("MULTA - VAS URBANO");
			}else {
						System.out.println("DESCUENTO - VAS URBANO");
		    }
		
			
			
			int temperatura = 2;
			
			switch (temperatura) {
			case 2: 
				System.out.println(" TEMP MONTERREY, MEXICO");
				System.out.println(" TEMP USA");
				break;
			case 19:
				System.out.println(" TEMP Argentina");
				break;
			case 12:
				System.out.println(" TEMP ECUADOR");
				break;
			case 17:
				System.out.println(" TEMP COLOMBIA");
				break;
				
				default:
					System.out.println(" TEMP TRO LUGAR");
					break;
			}
	   }
	}

