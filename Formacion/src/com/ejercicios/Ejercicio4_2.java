package com.ejercicios;

public class Ejercicio4_2 {

	public static void main(String[] args) {
		int cantidad = 3;
		int unidades = 12;
		double precio = 5.4;
		double importe = unidades*precio*cantidad;
		int total = 0;
		
		System.out.println("cantidad = "+cantidad);
		System.out.println("unidades = "+unidades);
		System.out.println("precio = "+precio);
		System.out.println("importe = "+ importe);
		System.out.println("Iva = "+importe*0.21);
		System.out.println("Total = "+(int) (importe*1.21)+ " deberia ser:"+importe*1.21);

		
	}

}
