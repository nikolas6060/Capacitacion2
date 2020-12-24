package com.capacitacion2.capacitacion2.clase7;

public class Motocicleta {

	private String marca;
	private String color;
	private int cilindraje;
	private int potencia;
	
	public Motocicleta(String marcaX, String colorX, int cilindrajeX, int potenciaX) {
		this.marca = marcaX;
		this.color = colorX;
		this.cilindraje = cilindrajeX;
		this.potencia = potenciaX;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getCilindraje() {
		return cilindraje;
	}

	public void setCilindraje(int cilindraje) {
		this.cilindraje = cilindraje;
	}

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}
	
		
}
