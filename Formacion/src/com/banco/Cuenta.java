package com.banco;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Vector;

public class Cuenta {

	private static ArrayList<Movimiento> movimientos;
	private String numero;
	private String titular;

	public Cuenta(String numero, String titular) {
		this.numero = numero;
		this.titular = titular;
		movimientos= new ArrayList<>();
	}

	public void addMovimiento(Movimiento m) {
		movimientos.add(m);
	}

	public static double getSaldo() {
		double saldo=0;
		for (Movimiento movimiento : movimientos)
				saldo+=movimiento.getImporte();
		return saldo;

	}

	public static void ingesar(double saldo) {
		try {
			if (saldo > 0) {
				String concepto = "Dinero ingresado";
				Movimiento movimiento = new Movimiento();
				movimiento.setConcepto(concepto);
				movimiento.setImporte(saldo);
			}
		} catch (Exception e) {
			System.out.println("El importe a ingresar tiene que ser positivo");
		}
	}

	public static void ingresar(String concepto, double saldo) {
		try {
			if (saldo > 0) {
				LocalDate fecha = LocalDate.now();
				Movimiento movimiento = new Movimiento();
				movimiento.setConcepto(concepto);
				movimiento.setImporte(saldo);
			}
		} catch (Exception e) {
			System.out.println("El importe a ingresar tiene que ser positivo");
		}
	}

	public static void retirar(double saldo) {
		try {
			if (saldo > 0) {
				String concepto = "Dinero retirado:";
				Movimiento movimiento = new Movimiento();
				movimiento.setConcepto(concepto);
				movimiento.setImporte(-saldo);
			}
		} catch (Exception e) {
			System.out.println("El importe a retirar tiene que ser positivo");
		}
	}

	public static void retirar(String concepto, double saldo) {
		try {
			if (saldo > 0) {
				Movimiento movimiento = new Movimiento();
				movimiento.setConcepto(concepto);
				movimiento.setImporte(-saldo);
			}
		} catch (Exception e) {
			System.out.println("El importe a retirar tiene que ser positivo");
		}
	}

}
