package com.ejercicios;

public class Datos {
	

		private int dia;
		private String nDni;
		private double precio;
		private boolean ACTIVO=true;
		public Datos(int dia, String nDni, double precio, boolean ACTIVO) {
			this.dia = 10;
			this.nDni = "57.433.222";
			this.precio = 20.50;
			ACTIVO = ACTIVO;
		}
		public int getDia() {
			return dia;
		}
		public void setDia(int dia) {
			this.dia = dia;
		}
		public String getnDni() {
			return nDni;
		}
		public void setnDni(String nDni) {
			this.nDni = nDni;
		}
		public double getPrecio() {
			return precio;
		}
		public void setPrecio(double precio) {
			this.precio = precio;
		}
		public boolean isACTIVO() {
			return ACTIVO;
		}
		public void setACTIVO(boolean ACTIVO) {
			ACTIVO = ACTIVO;
		}
		
		
	

}
