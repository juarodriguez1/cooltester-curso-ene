package com.java;

public class IsCatPlaying {

	public static void main(String[] args) {
		/*El m�todo debe devolver verdadero si el gato est� jugando; de lo contrario, devolver falso
		 * El primer par�metro debe ser de tipo booleano y debe llamarse "verano" que representa si es verano.
		 * El segundo par�metro representa la temperatura y es de tipo int con el nombre "temperatura".
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
