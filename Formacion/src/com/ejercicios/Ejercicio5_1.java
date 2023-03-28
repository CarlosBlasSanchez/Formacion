package com.ejercicios;

public class Ejercicio5_1 {

	public static void main(String[] args) {
		int num1=10;
		int num2=30;
		if (num1>num2 && num1!=num2)
			System.out.println("El primer número es mayor");
		if (num1<num2 && num1!=num2)
			System.out.println("El segundo número es mayor");
		if (num1==num2)
			System.out.println("Los números son iguales");
		if (num1==0 || num2==0){
			System.out.println("No son multiplos");
		} else {
			if(num1 % num2 == 0 || num2 % num1 == 0) {
				System.out.println("Son multiplos");
			}else {
				System.out.println("No son multiplos");
			}
		}

	}

}
