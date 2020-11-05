package com.capacitacion2.capacitacion2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.capacitacion2.capacitacion2.clase6.MultiMetodo;

public class MultiMetodoTest {

	MultiMetodo objMetodo;
	
	@Before
	public void inicializarPrecondiciones() {
		objMetodo = new MultiMetodo();
	}
	
	@Test
	public void testGetPalabra() {
		String expected = "Palabra1";
		String resultado = objMetodo.getPalabra("1");
		assertEquals(expected, resultado);
	}
	
	@Test
	public void testGetArregloCaracteres() {
		String palabra = "clase 6";
		char[] arregloEsperado = palabra.toCharArray();
		char[] actual = objMetodo.getArregloCaracteres(palabra);
		assertEquals(arregloEsperado, actual);
	}
	
	@Test
	public void testGetOpositive() {
		boolean esperado = false;
		boolean actual = objMetodo.getOpositive(true);
		//assertEquals(esperado, actual);
		assertTrue(actual);
	}
	
	@Test
	public void testDividir() {
		double esperado = 5;
		double resultado = objMetodo.dividir(10,2);
		assertEquals(esperado, resultado, 0.1);
	}
	
	@Test
	public void testMetodoNulo() {
		assertNull(objMetodo.metodoNulo());
		assertNotNull(objMetodo.metodoNulo());
	}
	
	@Test(expected = ArithmeticException.class)
	public void testDividirInt() {
		int esperado = 5;
		int resultado = objMetodo.dividirInt(10,2);
		assertEquals(esperado, resultado);
	}

}
