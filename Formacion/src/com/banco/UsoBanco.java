package com.banco;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

public class UsoBanco {

	public static void main(String[] args) {
		LocalDate fecha = LocalDate.now();
		Cuenta cuenta = new Cuenta("1111", "yo");
		Movimiento movimiento = new Movimiento();
		Tarjeta tarjetaCredito = new Credito("numTarjetaCre", "yo", fecha);
		Tarjeta tarjetaDebito = new Credito("numTarjetaDebi", "yo", fecha);

		tarjetaCredito.ingresar(1000);
		tarjetaCredito.pagoEnEstablecimiento("Compra 1", 20);
		System.out.println(tarjetaCredito.getSaldo());

		movimiento.setConcepto("Movimiento 1");
		movimiento.setImporte(20);
		cuenta.addMovimiento(movimiento);
		System.out.println(movimiento.getImporte());
		System.out.println(cuenta.getSaldo());
		
		
		
	}

}
