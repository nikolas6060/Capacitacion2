package com.capacitacion2.capacitacion2.clase4;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ManagerDriver {
	private WebDriver webDriver;
	private String nombreNavegador;
	private String urlPagina;
	
	public ManagerDriver (String NombreNavegador, String urlPagina) {
		this.nombreNavegador = NombreNavegador;
		this.urlPagina = urlPagina;
		seleccionarNavegador();
	}
	
	private void seleccionarNavegador() {
		switch (nombreNavegador.toLowerCase().trim()) {
		case "google":
			System.setProperty("webdriver.chrome.driver", "src\\main\\java\\resources\\drivers\\chromedriver.exe");
			webDriver = new ChromeDriver();
			break;
		case "firefox":
			
			break;
		case "ie":
			
			break;

		default:
			break;
		}
		
	}
	
	public void navegarAPagina() {
		webDriver.get(urlPagina);		
	}
	
	public void cerrarNavegador() {
		webDriver.close();
	}

	public WebDriver getWebDriver() {
		return webDriver;
	}

	public void setWebDriver(WebDriver webDriver) {
		this.webDriver = webDriver;
	}

	public String getNombreNavegador() {
		return nombreNavegador;
	}

	public void setNombreNavegador(String nombreNavegador) {
		this.nombreNavegador = nombreNavegador;
	}

	public String getUrlPagina() {
		return urlPagina;
	}

	public void setUrlPagina(String urlPagina) {
		this.urlPagina = urlPagina;
	}
		
}
