package com.java;

public class Perro {

	public static void main(String[] args) {
		
		
		boolean ladrando = true; 
		int hourOfDay = 8;

			
		if (ladrando) {
			if (hourOfDay >= 0 && hourOfDay <=23) {
				if (hourOfDay < 8 || hourOfDay >22) {
					System.out.println( "Despertar el perro ladra" );//V
					} else {
						System.out.println("Seguir durmiendo el perro no ladra");//F
					}
		      } else 	
		    	  System.out.println( "Fuera de rango" );
	}
		else 
			System.out.println( "Fresco el perro no ladra" );
		
}

}
