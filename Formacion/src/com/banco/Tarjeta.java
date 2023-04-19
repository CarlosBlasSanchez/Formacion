package com.banco;

import java.time.LocalDate;

public abstract class Tarjeta {
	
	protected static String numero;
	protected static String titular;
	private Cuenta nCuentaAsociada;
	private LocalDate fechaDeCaducidad;
	private static Cuenta cuentaAsociada;
	
	public Tarjeta(String numero, String titular, LocalDate fechaDeCaducidad) {
		super();
		this.numero = numero;
		this.titular = titular;
		this.fechaDeCaducidad = fechaDeCaducidad;
	}
	
	public abstract double getSaldo();
	
	public abstract void ingresar(double saldo);
	
	public abstract void pagoEnEstablecimiento(String datos, double precio);
	
	public abstract void retirar(double saldo);
	
	public static Cuenta getCuenta() {
		return cuentaAsociada;
	}
	public static void setCuenta(Cuenta c) {
		cuentaAsociada=c;
	}
	
	
	
}
