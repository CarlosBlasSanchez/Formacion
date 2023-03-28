package com.ejercicios;

public class Ejercicio5_7 {

	public static void main(String[] args) {
		int suma=0;
		for (int i=1; i<=10; i++) {
			if (i%5==0)
				suma+=i;
		}
		System.out.println("La suma de los 10 primeros números multiplos de 5 es: "+suma);

	}

}
