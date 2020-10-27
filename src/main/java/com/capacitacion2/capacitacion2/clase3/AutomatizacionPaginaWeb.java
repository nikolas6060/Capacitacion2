package com.capacitacion2.capacitacion2.clase3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomatizacionPaginaWeb {

	public void interacturasConGmail() {
		String ubicacionDriver = "src\\main\\java\\resources\\drivers\\chromedriver.exe";
		String urlInicioGmail = "https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin";
		System.setProperty("webdriver.chrome.driver", ubicacionDriver);
		WebDriver driver = new ChromeDriver();
		driver.get(urlInicioGmail);
		WebElement cajaTextoNombre = driver.findElement(By.id("identifierId"));
		cajaTextoNombre.sendKeys("prueba@prueba.com");
		try {
			Thread.sleep(5000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		driver.close();
	}

}
