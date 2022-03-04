package com.java;

public class IsCatPlaying {

	public static void main(String[] args) {
		/*El método debe devolver verdadero si el gato está jugando; de lo contrario, devolver falso
		 * El primer parámetro debe ser de tipo booleano y debe llamarse "verano" que representa si es verano.
		 * El segundo parámetro representa la temperatura y es de tipo int con el nombre "temperatura".
		 */
		
		boolean Verano = true; 
		int Temperatura = 50;

			
		if (Verano) {
			if (Temperatura >= 25 && Temperatura <=45) {
					System.out.println( "El gato esta jugando" );
					} else {
						System.out.println("El gato no esta jugando");
					}
		      } else if (Temperatura >= 25 && Temperatura <=35) {
					System.out.println( "El gato esta jugando" );
					} else {
						System.out.println("El gato no esta jugando");
					}
	}

}
