package com.java;

public class Ejercicio1 {

	public static void main(String[] args) {
		/* crear una clase con tres variables de tipo double e imprimir la suma,resta, 
		 * multiplicacion y division de las tres variables
		 * 
		 */
		double a = 16;
		double b = 3;
		double c = 8;
		
		double sum = a + b + c; {
		System.out.println("El valor de la suma es" +  sum);
		}
		
		double rest = a - b - c; {
			System.out.println("El valor de la resta es" +  rest);
		}
		
		double mult = (a * b) * c; {
			System.out.println("El valor de la multiplicacion es" +  mult);
		}
		
		double div = (a % b) % c; {
			System.out.println("El valor de la division es" +  div);
		}
	}

}
