package com.banco;

import java.time.LocalDate;

public class Movimiento {
	
	private String concepto;
	private LocalDate fecha;
	private double importe;
	public Movimiento() {
		fecha=LocalDate.now();
	}
	public String getConcepto() {
		return concepto;
	}
	public void setConcepto(String concepto) {
		this.concepto = concepto;
	}
	public LocalDate getFecha() {
		return fecha;
	}
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	public double getImporte() {
		return importe;
	}
	public void setImporte(double importe) {
		this.importe = importe;
	}
	
	
	
	
}
