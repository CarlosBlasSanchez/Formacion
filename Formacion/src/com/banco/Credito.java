package com.banco;

import java.time.LocalDate;
import java.util.ArrayList;

public class Credito extends Tarjeta {

	private double credito;
	private static ArrayList<Movimiento> movimientos;

	public Credito(String numero, String titular, LocalDate fechaDeCaducidad) {
		super(numero, titular, fechaDeCaducidad);
		movimientos = new ArrayList<>();
	}

	@Override
	public double getSaldo() {
		double saldo = 0;
		for (Movimiento movimiento : movimientos)
			saldo += movimiento.getImporte();
		return saldo;
	}

	@Override
	public void ingresar(double saldo) {
		String concepto = "Ingreso en cuenta asociada";
		Movimiento m = new Movimiento();
		m.setConcepto(concepto);
		m.setImporte(saldo);
		movimientos.add(m);
	}

	public static void liquidar(int mes, int año) {
		double saldo=0;
		Cuenta cuenta = new Cuenta(numero, titular);//getNCuentaAsociado
		for (Movimiento movimiento : movimientos) {
			if (movimiento.getFecha().getMonthValue() == mes) {
				saldo+=movimiento.getImporte();
				cuenta.addMovimiento(movimiento);
				movimientos.remove(movimiento);
			}		
		}
	}

	@Override
	public void pagoEnEstablecimiento(String datos, double precio) {
		try {
			if (getSaldo() > 0 && precio<getSaldo()) {
				String concepto = "Compra a crédito en: ";
				LocalDate fecha = LocalDate.now();
				Movimiento m = new Movimiento();
				m.setConcepto(concepto);
				m.setImporte(-precio);
				movimientos.add(m);
			}
		} catch (Exception e) {
			System.out.println("El importe de la compra tiene que ser positivo");
		}
	}

	@Override
	public void retirar(double saldo) {
		try {
			if (getSaldo() > 0) {
				String concepto = "Retirada en cuenta asociada";
				LocalDate fecha = LocalDate.now();
				if (saldo > 0 && saldo < 3) {
					saldo *= 1.05;
				}
				Movimiento m = new Movimiento();
				m.setConcepto(concepto);
				m.setImporte(saldo);
				movimientos.add(m);
			}
		} catch (Exception e) {
			System.out.println("El importe a retirar tiene que ser positivo");
		}
	}

}
