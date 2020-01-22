package br.com.rsinet.hub_BDD.AdvantageBDD;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import br.com.rsinet.hub_BDD.PageFactory.BuscaNaLupa2;
//import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BuscaNaLupa {
	
	private WebDriver driver = new ChromeDriver();

	private BuscaNaLupa2 buscanalupa;

	@Given("^o usuario esta na Pagina Inicial de procura$")
	public void o_usuario_esta_na_Pagina_Inicial() throws Throwable {
		
		buscanalupa = PageFactory.initElements(driver, BuscaNaLupa2.class);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		driver.get("https://www.advantageonlineshopping.com/#/");

	}

	@When("^o usuario clica em procurar$")
	public void o_usuario_clica_em_procurar() throws Throwable {
	   buscanalupa.search();
	}

	@When("^o usuario vai procurar por tablets$")
	public void o_usuario_vai_procurar_por_tablets() throws Throwable {
	    buscanalupa.Completa();
	}

	@Then("^o usuario vai escolher o seu tablet$")
	public void o_usuario_vaie_escolhe_o_seu_tablet() throws Throwable {
	   buscanalupa.HPELITEPAD1000G2();
	}
}
