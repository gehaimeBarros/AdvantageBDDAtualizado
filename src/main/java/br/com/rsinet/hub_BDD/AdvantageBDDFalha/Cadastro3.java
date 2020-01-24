package br.com.rsinet.hub_BDD.AdvantageBDDFalha;


import org.junit.Assert;
import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
//import org.openqa.selenium.support.ui.Select;

import br.com.rsinet.hub_BDD.AdvantageBDDFerramentas.DriverFactory;
import br.com.rsinet.hub_BDD.AdvantageBDDUtil.TakeSnapShot3;
//import br.com.rsinet.hub_BDD.AdvantageBDDUtil.TakeSnapShot3;
//import br.com.rsinet.hub_BDD.PageFactory.CadastroUsu;
import br.com.rsinet.hub_BDD.PageFactoryDeFalha.Cadastro4;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Cadastro3 {
private WebDriver driver;
	
	private Cadastro4 cadastroCliente;
	
	@Given("^que usuario esta na Pagina inicial$")
	public void que_usuario_esta_na_Pagina_inicial() throws Throwable {
		driver=DriverFactory.inicializador();
		cadastroCliente = PageFactory.initElements(driver, Cadastro4.class);
		}

	@When("^o usuario clica no menu$")
	public void o_usuario_clica_no_menu() throws Throwable {
	   cadastroCliente.menu();
	}

	@When("^o usuario clica criar uma nova Conta$")
	public void o_usuario_clica_criar_uma_nova_Conta() throws Throwable {
	    cadastroCliente.novaConta();
	}

	@When("^o usuario ira preencher o cadastro com seus dados$")
	public void o_usuario_ira_preencher_o_cadastro_com_seus_dados() throws Throwable {
	    cadastroCliente.CadastrodeFalha();

	}

	@When("^o usuario clica em aceito$")
	public void o_usuario_clica_em_aceito() throws Throwable {
	    cadastroCliente.aceito();
	}
	
	@Then("^o usuario tenta e nao consegue clica em registrar$")
	public void o_usuario_tenta_e_nao_consegue_clica_em_registrar() throws Throwable {
	    cadastroCliente.registrar();
	    String resposta = driver.findElement(By.xpath("/html/body/div[3]/section/article/sec-form/div[1]/div[2]/div/div[1]/div[2]/sec-view[1]/div/label")).getText();
		System.out.println(resposta);
		Assert.assertTrue("Senha incorreta",resposta.equals("Use maximum 12 character"));
	    TakeSnapShot3.tirarPrintsDeFalha("Cadasatro de cliente falha", driver);
		DriverFactory.Quit(driver);
	}
}

