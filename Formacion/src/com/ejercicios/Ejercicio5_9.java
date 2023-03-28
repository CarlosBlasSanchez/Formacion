package com.ejercicios;

public class Ejercicio5_9 {

	public static void main(String[] args) {
		for(int i=1; i<11; i++) {
			System.out.println("Tabla del "+i);
			System.out.println("------------------");
			for(int j=0; j<11; j++) {
				System.out.println(i+" x "+j+" = "+(j*i));
			}
			System.out.println();
		}

	}

}
