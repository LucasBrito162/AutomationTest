package br.com.comofazer.maven;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;



public class pageHomeTest extends BaseTest  {
	
	
	
	@Test
	public void TC_001_DeveEntraNaPaginaDeRegistroAoClicarNoBotaoSkipSign(){
		pageHomePO pageHome = new pageHomePO(driver);
		pageHome.buttonskipSign();
		pageRegisterPO pageRegister = new pageRegisterPO(driver);
		pageRegister.tituloPageRegister();
		Assertions.assertEquals("Automation Demo Site ", "Automation Demo Site ");
		
}
	@Test
	public void TC_002_DeveEntraNaPaginaDeRegistroAoClicarNoBotaoEnter() {
		pageHomePO pageHome = new pageHomePO(driver);
		pageHome.buttonEnter();
		pageRegisterPO pageRegister = new pageRegisterPO(driver);
		pageRegister.tituloPageRegister();
		Assertions.assertEquals("Automation Demo Site ", "Automation Demo Site ");
		
	}
	
	@Test
	public void TC_003_DeveEntraNaPaginaDeLogarAoClicarNoBotaoSign() {
		pageHomePO pageHome = new pageHomePO(driver);
		pageHome.buttonSign();
	
		
	}
	}
