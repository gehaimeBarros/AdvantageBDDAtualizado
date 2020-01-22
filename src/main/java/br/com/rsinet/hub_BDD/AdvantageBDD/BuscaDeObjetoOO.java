package br.com.rsinet.hub_BDD.AdvantageBDD;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import br.com.rsinet.hub_BDD.PageFactory.BuscaDeObjeto2;
//import br.com.rsinet.hub_BDD.PageFactory.CadastroUsu;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BuscaDeObjetoOO {
	private WebDriver driver = new ChromeDriver();

	private BuscaDeObjeto2 BuscaDeObjeto;

	@Given("^o usuario esta na Pagina compra$")
	public void o_usuario_esta_na_Pagina_inicial() throws Throwable {
		
		BuscaDeObjeto = PageFactory.initElements(driver, BuscaDeObjeto2.class);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		driver.get("https://www.advantageonlineshopping.com/#/");

	}

	@When("^o usuario clica em LAPTOPS$")
	public void o_usuario_clica_em_LAPTOPS() throws Throwable {
	    BuscaDeObjeto.LAPTOPS();
	}

	@When("^o usuario clica no laptop escolhido$")
	public void o_usuario_clica_no_laptop_escolhido() throws Throwable {
		BuscaDeObjeto.HPPAVILIONX360();
    
	}

	@When("^o usuario adiciona no carrinho$")
	public void o_usuario_adiciona_no_carrinho() throws Throwable {
		BuscaDeObjeto.Addcarinho();
	    }

	@Then("^o usuario clica em check$")
	public void o_usuario_clica_em_check() throws Throwable {
	    BuscaDeObjeto.check();
	}


}