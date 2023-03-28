package com.ejercicios;

public class Ejercicio5_3 {

	public static void main(String[] args) {
		int dia = 31;
		int mes = 3;
		int año = 2015;
		if (diasRealesMesesArray(dia, mes, año))
			System.out.println("Está bien escrita la fecha");
		else
			System.out.println("La fecha está mal escrita");

	}

	public static boolean meses30Dias(int dia, int mes, int año) {
		if (dia <= 0 || dia >= 31)
			return false;
		if (mes <= 0 || mes >= 13)
			return false;
		if (año <= 0)
			return false;
		return true;
	}

	public static boolean diasRealesMeses(int dia, int mes, int año) {

		switch (mes) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			if (dia <= 0 || dia >= 32)
				return false;
			break;
		case 2:
			if (dia <= 0 || dia >= 29)
				return false;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			if (dia <= 0 || dia >= 31)
				return false;

		default:
			return false;
		}
		if (año <= 0)
			return false;
		return true;

	}

	public static boolean diasRealesMesesArray(int dia, int mes, int año) {
		int meses[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		for (int i = 0; i < meses.length; i++) {
			if (dia > 0 && dia <= meses[mes - 1]) {
				return true;
			}
		}
		return false;
	}

}
