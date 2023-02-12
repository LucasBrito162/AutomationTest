package br.com.comofazer.maven;


import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePO {
	
	protected WebDriver driver;

 
public BasePO(WebDriver driver) {
	this.driver = driver;
	PageFactory.initElements(driver, this);
	
	
}


public void escrever(WebElement input, String string){
    input.clear();
    input.sendKeys(string + Keys.TAB);
}
}