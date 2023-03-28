package com.ejercicios;

public class Ejercicio5_8 {

	public static void main(String[] args) {
		int num=8;
		int acumulador=1;
		for (int i=1; i<=num; i++){
			acumulador=i*acumulador;
		}
		System.out.println("El factorial de 8 es:"+acumulador);

	}

}
