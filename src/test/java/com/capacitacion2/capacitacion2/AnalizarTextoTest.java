package com.capacitacion2.capacitacion2;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.capacitacion2.capacitacion2.clase5.AnalizarTexto;

public class AnalizarTextoTest {
	
	private AnalizarTexto objAnalizarTexto;
	private String oracion;
	
	@Before
	public void before() {
		System.out.println("Se ejecuto antes before()");
		oracion = " esta clase es de pruebas unitarias ";
		objAnalizarTexto = new AnalizarTexto(oracion);
	}

	@Test
	public void testdeterminarNumeroDePalabras() {
		System.out.println("Se ejecuto test testdeterminarNumeroDePalabras");
		oracion = " esta clase es de pruebas unitarias ";
		int valorEsperado = 6;
    	int valorRecibido = AnalizarTexto.determinarNumeroDePalabras(oracion);
    	assertEquals(valorEsperado, valorRecibido);
	}
	
	@Test
	public void testcantidadCaracteres() {
		System.out.println("testcantidadCaracteres");
		int esperado = 35;
    	int resultado = objAnalizarTexto.cantidadCaracteres();
    	assertEquals(esperado, resultado);
	}
	
	
	@After
	public void after() {
		System.out.println("Se ejecuto after");
	}

}
