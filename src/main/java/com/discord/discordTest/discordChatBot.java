package com.discord.discordTest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class discordChatBot {
 //@FindBy (xpath = "//a[@title=\"ZEUS | Destripando la Historia | Canción\"]")
 
	
	 WebDriver driver;
	 WebDriverWait wait;
		
	
	@Before // Se pone donde inicia la ejecucion
		public void navegarUrl()  {
			 
			driver = new ChromeDriver();
			wait = new WebDriverWait(driver, 5);
			driver.get("https://discordapp.com/");
		
		}
	
	@Test	// Corre Los Tests (solo 1)
		public void loguinDiscord() throws InterruptedException {
		WebElement clickLogin = driver.findElement(By.xpath("//a[@href='//discordapp.com/login']"));
		
		if(clickLogin.isDisplayed())
			System.out.println("Se encontro el elemento Boton Login.");
		else {
			System.out.println("No se encontro el elemento.");
			System.exit(-1);
		}
		
		clickLogin.click();
		
		Thread.sleep(1000);
		
		WebElement userName = driver.findElement(By.xpath("//input[@name=\"email\"]"));
		userName.sendKeys("xxxx@hotmail.com");
		WebElement passUser = driver.findElement(By.xpath("//input[@name=\"password\"]"));
		passUser.sendKeys("xxxxx");
		
		if(userName.isDisplayed() && passUser.isDisplayed())
			System.out.println("Se encontraron los elementos: Usuario, Pass y Boton.");
		else {
			System.out.println("No se encontraron los elementos.");
			System.exit(-1);
		}
		
		Thread.sleep(1000);
		
		WebElement botonLog = driver.findElement(By.xpath("//div[contains(text(),\"Login\")]"));
		botonLog.click();
		
		Thread.sleep(10000);
		
//			WebElement buscadorYutu = driver.findElement(By.xpath("//input[@id=\"search\"]"));
//			buscadorYutu.click();
//			buscadorYutu.sendKeys("ZEUS, Destripando la Historia");
//			WebElement botonBuscar = driver.findElement(By.xpath("//button[@id=\"search-icon-legacy\"]"));
//			botonBuscar.click();
//			
//			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@title=\"ZEUS | Destripando la Historia | Canción\"]"))).click(); 
//			
//			
//			WebElement tituloVideo = driver.findElement(By.xpath("//h1[@class=\"title style-scope ytd-video-primary-info-renderer\"]"));
//			
//			if(tituloVideo.isDisplayed())
//				
//				System.out.println("Se encontro el elemento de la validacion.");
//
//			else {
//				System.out.println("No se encontro el elemento.");
//				System.exit(-1);
//			
//		   }
//			
		}

		
	@After	//Termina la ejecucion
		public void cerrarpag() {
			
			driver.close();
			driver.quit();
		
	}

}
