package com.capacitacion2.capacitacion2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.capacitacion2.capacitacion2.clase6.Calculadora;

public class CalculadoraTest {
	
	Calculadora objCalculadora;

	
	@Before
	public void inicializarPrecondiciones() {
		objCalculadora = new Calculadora();
	}
	
	@Test
	public void testSuma() {
		double esperado = 5;
		double resultado = objCalculadora.suma(3,2);
		assertEquals(esperado,resultado,0.1);
	}
		
	@Test
	public void testResta() {
		double esperado = 5;
		double resultado = objCalculadora.resta(10,5);
		assertEquals(esperado,resultado,0.1);
	}
	
	@Test
	public void testMultiplicacion() {
		double esperado = 5;
		double resultado = objCalculadora.multiplicacion(1,5);
		assertEquals(esperado,resultado,0.1);
	}
		
	@Test
	public void testDivision() {
		double esperado = 5;
		double resultado = objCalculadora.division(10,2);
		assertEquals(esperado,resultado,0.1);
	}

}
