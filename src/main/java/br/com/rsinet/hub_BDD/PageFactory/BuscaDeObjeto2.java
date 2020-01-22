package br.com.rsinet.hub_BDD.PageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class BuscaDeObjeto2 {
	

	@FindBy(how = How.ID, using = "laptopsImg")
	private WebElement LAPTOPS;
	@FindBy(how = How.ID, using = "11")
	private WebElement HPPAVILIONX360 ;
	@FindBy(how = How.NAME, using = "save_to_cart")
	private WebElement Addcarinho;
	@FindBy(how = How.ID, using = "checkOutPopUp")
	private WebElement check;
	
	public void LAPTOPS() {
		LAPTOPS.click();
	}

	public void HPPAVILIONX360() {
		HPPAVILIONX360.click();
	}

	public void Addcarinho() {
		Addcarinho.click();
	}
	public void check() {
		check.click();
	}
}
