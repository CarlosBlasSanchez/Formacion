package com.ejercicios;

public class Ejercicio5_11 {

	public static void main(String[] args) {
		int contNumPrimos = 0;
		for (int i = 1; i < 100; i++) {
			boolean esPrimo = true;
			int j = 2;
			while (j <= (i / 2) - 1 && esPrimo) {
				if (i % j == 0)
					esPrimo = false;
				j++;
			}
			if (esPrimo) {
				contNumPrimos++;
				System.out.println("El número: " + i + " es primo");
			}
		}
		System.out.println("En total hay: " + contNumPrimos);

	}

}
