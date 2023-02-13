package br.com.comofazer.maven;
import org.junit.jupiter.api.Test;

public class pageRegisterTest extends BaseTest{

	
	@Test
	public void TC_001_DevePreencherTodosCamposObrigatorios() {
		pageHomePO pageHome = new pageHomePO(driver);
		pageHome.buttonskipSign();
		pageRegisterPO pageRegister = new pageRegisterPO(driver);
		pageRegister.preencher();
	}
	
	
	
	
}
