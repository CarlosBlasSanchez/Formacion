package com.ejercicios;

public class EjercicioString {

	public static void main(String[] args) {
		String entrada = "";
		for (int i = 0; i < args.length; i++) {
			entrada += args[i] + " ";
		}
		System.out.println("fase 1: " + entrada);

		int longitud = entrada.length();
		System.out.print("fase 2:");
		String aux = "";
		for (int j = longitud - 1; j >= 0; j--) {
			switch (entrada.charAt(j)) {
			case 'a':
				aux += 4;
				break;
			case 'e':
				aux += 3;
				break;
			case 'i':
				aux += 1;
				break;
			case 'o':
				aux += 0;
				break;
			case 'u':
				aux += 9;
				break;
			default:
				aux += entrada.charAt(j);
				break;
			}

		}
		System.out.println(aux);
		System.out.print("fase 3:");
		char caracterComodin=entrada.charAt(0);
		for (int k = entrada.indexOf(caracterComodin) + 1; k != entrada.lastIndexOf(caracterComodin); k++) {
			System.out.print(entrada.charAt(k));
		}
		System.out.println();
		/*entrada += "*";
		int contWhile = 0;
		System.out.print("fase 4:");
		while (entrada.charAt(0)!=(entrada.indexOf('*'))) {
			System.out.print(entrada.charAt(contWhile));
			contWhile++;
		}*/

	}

}
