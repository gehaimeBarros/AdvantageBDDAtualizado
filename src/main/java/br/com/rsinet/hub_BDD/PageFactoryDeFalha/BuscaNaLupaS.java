package br.com.rsinet.hub_BDD.PageFactoryDeFalha;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class BuscaNaLupaS{
	
	@FindBy(how = How.ID, using = "menuSearch")
	private WebElement search;
	@FindBy(how = How.ID, using = "autoComplete")
	private WebElement Completa;
	@FindBy(how = How.ID, using = "16")
	private WebElement HPELITEPAD1000G2;

	public void search() {
		search.click();
	}

	public void Completa() {
		Completa.sendKeys("xiaomi" + Keys.ENTER);
	}

	}


