package com.capacitacion2.capacitacion2.clase4;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class PageObjectTourFrancia extends PageFactory {

	private WebDriver webDriver;

	public PageObjectTourFrancia(WebDriver webDriver) {
		PageFactory.initElements(webDriver, this);
	}

	@FindBy(id = "selectweb")
	private WebElement listaSeleccionMultiple;

	@FindBy(className = "ue-table-ranking__cyclist-name")
	private List<WebElement> listaCiclistas;

	public void seleccionListaDesplegable(String opcion) {
		Select select = new Select(listaSeleccionMultiple);
		select.selectByVisibleText(opcion);

	}

	public void imprimirListaCiclistas() {
		int acumulador = 1;
		for (WebElement posicion : listaCiclistas) {
			System.out.println(acumulador + ": " + posicion.getText());
			acumulador++;
		}
	}

	public void imprimirLiderEtapa() {
		WebElement posicion = listaCiclistas.get(0);
		System.out.println(posicion.getText());
	}

}
