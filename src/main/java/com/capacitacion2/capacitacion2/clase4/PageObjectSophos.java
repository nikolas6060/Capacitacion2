package com.capacitacion2.capacitacion2.clase4;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ForkJoinPool.ManagedBlocker;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class PageObjectSophos extends PageFactory {
	private WebDriver webDriver;
	private String trabajeConNosotros = "mega-menu-item-1541";
	// private String popup = "gpb-popup-dialog-main-div";
	private String popup = "sg-popup-content-wrapper-5998";
	private String xpathNombreOferta = "//*[@id=\"content\"]/article/div/div/div/div/section[2]/div/div/div/div/div/div[2]/div/div[1]/div[2]/div[\"+i+\"]/div/div[2]/div[1]/div/h3/a";
	private String xpathFechaOferta = "//*[@id=\"content\"]/article/div/div/div/div/section[2]/div/div/div/div/div/div[2]/div/div[1]/div[2]/div[\"+i+\"]/div/div[2]/div[1]/div/div/span/span";
	private String xpathDescripciónOferta = "//*[@id=\"content\"]/article/div/div/div/div/section[2]/div/div/div/div/div/div[2]/div/div[1]/div[2]/div[\"+i+\"]/div/div[2]/div[2]";

	public PageObjectSophos(WebDriver webDriver) {
		PageFactory.initElements(webDriver, this);
	}

	public void seleccionTrabajeConNosotros(WebDriver webDriver2) {
		try {
			espera(1);
			webDriver2.findElement(By.id(popup)).click();
			espera(1);
			ArrayList<String> tabs2 = new ArrayList<String>(webDriver2.getWindowHandles());
			webDriver2.switchTo().window(tabs2.get(1));
			webDriver2.close();
			webDriver2.switchTo().window(tabs2.get(0));
			espera(1);
			webDriver2.findElement(By.id(trabajeConNosotros)).click();
			espera(1);
		} catch (Exception e) {
			// e.printStackTrace();
		}
	}

	public void mostrarOfertas(WebDriver webDriver2) {
		int contador = 0;
		int contadorPagina = 6;
		for (int i = 1; i < 10; i++) {
			try {
				String nombreOferta = webDriver2.findElement(By.xpath(xpathNombreOferta)).getText();
				String fechaOferta = webDriver2.findElement(By.xpath(xpathFechaOferta)).getText();
				String descripcionOferta = webDriver2.findElement(By.xpath(xpathDescripciónOferta)).getText();
				contador++;
				System.out.println("Oferta: " + contador);
				System.out.println("Nombre de la oferta: " + nombreOferta);
				System.out.println("Fecha de publicación: " + fechaOferta);
				System.out.println("Descripción: " + descripcionOferta + " \n");
				if (i == 9) {
					String botonSiguiente = "/html/body/div[1]/div/main/div/div/div/article/div/div/div/div/section[2]/div/div/div/div/div/div[2]/div/div[2]/ul/li["
							+ contadorPagina + "]/a";
					webDriver2.findElement(By.xpath(botonSiguiente)).click();
					i = 0;
					contadorPagina++;
				}

			} catch (Exception e) {
				// e.printStackTrace();
			}
		}
	}

	public void espera(int tiempo) {
		try {
			Thread.sleep(tiempo * 1000);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
