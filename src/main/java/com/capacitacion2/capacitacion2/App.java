package com.capacitacion2.capacitacion2;

import org.openqa.selenium.WebElement;

import com.capacitacion2.capacitacion2.clase3.AutomatizacionPaginaWeb;
import com.capacitacion2.capacitacion2.clase4.ManagerDriver;
import com.capacitacion2.capacitacion2.clase4.PageObjectTourFrancia;
import com.capacitacion2.capacitacion2.clase5.AnalizarTexto;
import com.capacitacion2.capacitacion2.clase7.Clase;
import com.capacitacion2.capacitacion2.clase7.Motocicleta;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		
		/*
		 * Motocicleta moto = new Motocicleta("Yamaha", "rojo", 153, 15);
		 * System.out.println("El cilindraje de la moto es "+moto.getCilindraje()+" cc"
		 * ); System.out.println("Se repotencio la motocicleta");
		 * moto.setCilindraje(190);
		 * System.out.println("El cilindraje de la moto es "+moto.getCilindraje()+" cc"
		 * );
		 * 
		 * Clase objClase = new Clase(); objClase.metodo();
		 */
		
		/**
		 * AutomatizacionPaginaWeb objLanzarPagina = new AutomatizacionPaginaWeb();
		 * objLanzarPagina.interacturasConGmail();
		 */

		//Tarea Clase 5
		String urlPagina = "https://www.marca.com/ciclismo/tour-francia/clasificacion.html";
		ManagerDriver objManager = new ManagerDriver("google", urlPagina);
		objManager.navegarAPagina();
		PageObjectTourFrancia objTour = new PageObjectTourFrancia(objManager.getWebDriver());
		//objTour.seleccionListaDesplegable("Etapa 17");
		espera(5);
		// objTour.imprimirListaCiclistas();
		for (int i=1; i<=21; i++) {
			objTour.seleccionListaDesplegable("Etapa "+i);
			System.out.println("Líder Etapa "+i+":");
			espera(5);
			objTour.imprimirLiderEtapa();
		}
		espera(5);
		objManager.cerrarNavegador();

		/**
		 * String oracion = " esta clase es de pruebas unitarias ";
		 * System.out.println("El número de palabras de la oración es
		 * "+AnalizarTexto.determinarNumeroDePalabras(oracion));
		 */
		

	}

	public static void espera(int tiempo) {
		try {
			Thread.sleep(tiempo * 1000);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
