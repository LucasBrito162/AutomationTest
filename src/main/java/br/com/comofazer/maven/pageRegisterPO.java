package br.com.comofazer.maven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class pageRegisterPO extends BasePO{
	
	
	public void tituloPageRegister() {
		driver.findElement(By.cssSelector("#header > div > div > div > div.col-sm-8.col-xs-8.col-md-8 > h1")).getText();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	public pageRegisterPO(WebDriver driver) {
		super(driver);
		
	}
	
	

}
