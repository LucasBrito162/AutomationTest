package br.com.comofazer.maven;



import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;


public abstract  class BaseTest  {
	
	protected static  WebDriver driver;
	private static final String URL_BASE = "https://demo.automationtesting.in/Index.html";
	private static final String CAMINHO_DRIVER = "D:/Alura Programas/maven/drivers/chromedriver.exe";
	
	
	
	
	@BeforeEach
	public void inicializa() {
	System.setProperty("WebDriver.chrome.driver", CAMINHO_DRIVER);
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get(URL_BASE);
	
	
	PageFactory.initElements(driver, this);
	}
	
	@AfterEach
	public void finalizar() {
		driver.quit();
	}
	
}

	
	
	
	

