package com.capacitacion2.capacitacion2.clase8.stepdefinitions;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;

import com.capacitacion2.capacitacion2.clase10.Palabras;
import com.capacitacion2.capacitacion2.clase4.ManagerDriver;
import com.capacitacion2.capacitacion2.clase4.PageObjectSophos;
import com.capacitacion2.capacitacion2.clase4.PageObjectTourFrancia;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Given;

public class Step {

	private List<Integer> listaNumeros;
	private int ultResultado;
	private Palabras palabra;
	private ManagerDriver objManager = new ManagerDriver("google", "");
	private PageObjectSophos objSophos = new PageObjectSophos(objManager.getWebDriver());
	
	@Before
	public void antesDe() {}{
		ultResultado = 0;
	}
	
	@After
	public void despuesDe() {}{
		ultResultado = 0;
	}
	
	public void establecerLista() {
		listaNumeros = new ArrayList<>();
	}
	
	public void el_usuario_suma_los_numeros_ingresados() throws Throwable{
		for (Integer numero: listaNumeros) {
			ultResultado += numero;
		}
	}
	
	@Then("La longitud de la oración debe ser de")
	public void longitudOracion (int numero) throws Throwable{
		System.out.println("Longitud esperada " + numero);
		assertEquals(numero, palabra.longitudPalabra());
	} 
	
	@Then("El usuario concatena la oración")
	public void concatenar (String complemento) throws Throwable{
		System.out.println("El usuario concatena la oración " + complemento);
		assertTrue(palabra.longitudPalabra()>0);
	}
	
	
	@Given("^El usuario requiere saber las ofertas en la pagina de sophos$")
	public void el_usuario_requiere_saber_las_ofertas_en_la_pagina_de_sophos() throws Throwable {
		String urlPagina = "https://www.sophossolutions.com/ ";
		objManager = new ManagerDriver("google", urlPagina);
		objManager.navegarAPagina();
		objSophos.seleccionTrabajeConNosotros(objManager.getWebDriver());
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			// TODO: handle exception
		}	
	}

	@When("^el usuario consulta las ofertas en la pagina$")
	public void el_usuario_consulta_las_ofertas_en_la_pagina() throws Throwable {
		objSophos.seleccionTrabajeConNosotros(objManager.getWebDriver());
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	@Then("^se listan las ofertas publicadas en la pagina$")
	public void se_listan_las_ofertas_publicadas_en_la_pagina() throws Throwable {
		objSophos.mostrarOfertas(objManager.getWebDriver());
		objManager.cerrarNavegador();
	}
	
}
