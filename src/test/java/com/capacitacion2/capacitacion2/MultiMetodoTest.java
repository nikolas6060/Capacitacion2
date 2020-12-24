package com.capacitacion2.capacitacion2;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.capacitacion2.capacitacion2.clase6.MultiMetodo;

@RunWith(value = Parameterized.class)
public class MultiMetodoTest {

	private MultiMetodo objMetodo;
	private int esperado;
	private int valorActual;
	private int variableA;
	private int variableB;
	
	public MultiMetodoTest (int esperado, int variableA, int variableB) {
		this.esperado = esperado;
		this.variableA = variableA;
		this.variableB = variableB;
	}
	
	@Parameters
	public static Iterable datosEntrada() {
		List<Object[]> listaDeValores = new ArrayList<>();
		//listaDeValores.add((Object[]) new Object[] (2,10,5));
		//listaDeValores.add(new Object[] (3,7,21));
		//listaDeValores.add(new Object[] (5,100,20));
		return listaDeValores;
	}	
	
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
	
	@Test(timeout = 2000)
	public void testTimeout() {
		objMetodo.timeout();
	}


}
