package com.capacitacion2.capacitacion2.clase5;

public class AnalizarTexto {
	
	private String oracion;
	
	public AnalizarTexto(String oracion) {
		this.oracion = oracion;
	}

	public static int determinarNumeroDePalabras (String oracion) {
		
		return oracion.trim().split(" ").length;
	}
	
	public int cantidadCaracteres() {
		return oracion.length();
	}

	public String getOracion() {
		return oracion;
	}

	public void setOracion(String oracion) {
		this.oracion = oracion;
	}
	
}
