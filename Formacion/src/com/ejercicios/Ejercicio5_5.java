package com.ejercicios;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio5_5 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		ArrayList<Integer> arrayListNumeros = new ArrayList<>();
		int num = 0;
		do {
			System.out.println("Introduce un número: (cuando no quiera seguir introduciendo escriba 0)");
			num = entrada.nextInt();
			if (num!=0)
			arrayListNumeros.add(num);
		} while (num != 0);
		
		for (int i=0; i<arrayListNumeros.size(); i++) {
			System.out.println(arrayListNumeros.get(i)*arrayListNumeros.get(i));
			
		}

	}

}
