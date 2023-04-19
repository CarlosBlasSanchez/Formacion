package com.banco;

import java.time.LocalDate;

public class Debito extends Tarjeta {

	public Debito(String numero, String titular, LocalDate fechaDeCaducidad) {
		super(numero, titular, fechaDeCaducidad);
		
	}
	@Override
	public double getSaldo() {
		
		return 0;
	}
	@Override
	public void ingresar(double saldo) {
		
		
	}
	@Override
	public void pagoEnEstablecimiento(String datos, double precio) {
		
		
	}
	@Override
	public void retirar(double saldo) {
		
		
	}
	
	
}
