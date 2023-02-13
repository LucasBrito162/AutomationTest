package br.com.comofazer.maven;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class pageRegisterPO extends BasePO{
	
	
	
	
	
	public pageRegisterPO(WebDriver driver) {
		super(driver);
		
	}



	public void tituloPageRegister() {
		
		driver.findElement(By.cssSelector("#header > div > div > div > div.col-sm-8.col-xs-8.col-md-8 > h1")).getText();
	}
	
		WebElement nome = 
			driver.findElement(By.cssSelector("#basicBootstrapForm > div:nth-child(1) > div:nth-child(2) > input"));
				
		
		
	WebElement sobrenome =
			driver.findElement(By.cssSelector("#basicBootstrapForm > div:nth-child(1) > div:nth-child(3) > input"));
	
	
	WebElement email =
			driver.findElement(By.cssSelector("#eid > input"));
	
	WebElement phone =
			driver.findElement(By.cssSelector("#basicBootstrapForm > div:nth-child(4) > div > input"));
	
	WebElement genero = 
			driver.findElement(By.cssSelector("#basicBootstrapForm > div:nth-child(5) > div > label:nth-child(1) > input"));
	
	WebElement pais =
			driver.findElement(By.cssSelector("#countries"));
	
	WebElement buttonSubmit =
			driver.findElement(By.id("submitbtn"));
	
	public void preencher() {
	
	nome.sendKeys("lucas");
	sobrenome.sendKeys("brito" + Keys.TAB);
	email.sendKeys("lucas@email.com" + Keys.TAB);
	phone.sendKeys("11940738778" + Keys.TAB);
	genero.click();
	pais.sendKeys("Brasil" + Keys.TAB);
	buttonSubmit.click();
	}
	
	

}
