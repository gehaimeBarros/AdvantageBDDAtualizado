package br.com.rsinet.hub_BDD.PageFactoryDeFalha;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class BuscaDeObjeto8{
	
	@FindBy(how = How.ID, using = "speakersImg")
	private WebElement caixadesom;
	@FindBy(how = How.ID, using = "19")
	private WebElement ALTOFALANTEHPS9500;
	@FindBy(how = How.NAME, using = "quantity")
	private WebElement quantidade;
	@FindBy(how = How.NAME, using = "save_to_cart")
	private WebElement AddNoCarrinho;
	
	public void caixadesom() {
		caixadesom.click();
	}

	public void ALTOFALANTEHPS9500() {
		ALTOFALANTEHPS9500.click();
	}

	public void quantidade() {
		quantidade.sendKeys("100");
	}
	public void AddNoCarrinho() {
		AddNoCarrinho.click();
	}
}


