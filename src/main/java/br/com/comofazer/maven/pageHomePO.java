package br.com.comofazer.maven;

	
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class pageHomePO extends BasePO{
	


	
public void buttonskipSign() {
		
		driver.findElement(By.id("btn2")).click();
}
	
public void buttonEnter() {
	driver.findElement(By.id("enterimg")).click();
}

public void buttonSign() {
	driver.findElement(By.id("btn1")).click();
}

	
	
	
public pageHomePO(WebDriver driver) {
	super(driver);
	
}







}






	

