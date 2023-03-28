package com.ejercicios;

public class Ejercicio5_4 {

	public static void main(String[] args) {
		int num=16;
		int contDecenas=0;
		int contUnidades=0;
		while(num!=0) {
			if (num<100 && num>=10) {
				num=num-10;
				contDecenas++;
			}
				
			if (num<10 && num>0) {
				contUnidades++;
				num--;
			}
				
		}
		System.out.println(contDecenas + " " + contUnidades);
		
		String arrayDecenas[]= {"", "dieci","veinti","treintai","cuarentai", "cincuentai",
				"sesentai","setentai","ochentai","noventai"};
		String arrayUnidades[]= {"", "uno","dos","tres","cuatro","cinco","seis","siete","ocho","nueve"};
		String arrayAcabados0[]= {"cero","diez","veinte","treinta","cuarenta","cincuenta","sesenta",
				"setenta", "ochenta", "noventa"};
		String arrayDel11Al15[]= {"once","doce","trece","catorce","quince"};
		if (contUnidades==0)
			System.out.println(arrayAcabados0[contDecenas]);
		else if (contDecenas==1 && contUnidades>=1 && contUnidades<=5)
				System.out.println(arrayDel11Al15[contUnidades-1]);
			else
			System.out.println(arrayDecenas[contDecenas]+arrayUnidades[contUnidades]);

		
	}

}
