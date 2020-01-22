package br.com.rsinet.hub_BDD.AdvantageBDD;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import br.com.rsinet.hub_BDD.AdvantageBDDUtil.TakeSnapShot5;
import br.com.rsinet.hub_BDD.PageFactory.CadastroUsu;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Usuario_Test {
	private WebDriver driver = new ChromeDriver();
	
	private CadastroUsu cadastroUsuario;

	@Given("^o usuario esta na Pagina inicial Advantage$")
	public void que_usu_rio_est_na_P_gina_inicial() throws Throwable {
 
		cadastroUsuario = PageFactory.initElements(driver, CadastroUsu.class);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		driver.get("https://www.advantageonlineshopping.com/#/");
		
	}

	@When("^o usuario clica no menu$")
	public void o_usuario_clica_no_menu() throws Throwable {
		cadastroUsuario.menu();
	}

	@When("^o usuario clica em novaConta$")
	public void o_usu_rio_clica_em_novaConta() throws Throwable {
		cadastroUsuario.novaConta();
	}
	@When("^o usuario preenche o cadastro$")
	public void o_usuario_preenche_o_cadastro() throws Throwable {
	   cadastroUsuario.CadastroDELogin();
	}

	@When("^o usuario clica em aceito$")
	public void o_usuario_clica_em_aceito() throws Throwable {
	   cadastroUsuario.aceito();
	}

	@Then("^o usuario clica em registrar$")
	public void o_usuario_clica_em_registrar() throws Throwable {
		cadastroUsuario.registrar();
		String resposta = driver.findElement(By.xpath("//*[@id=\"menuUserLink\"]/span")).getText();
		System.out.println(resposta);
		Assert.assertFalse("Cadastro bem sucedido",resposta.equals("Ok"));
		TakeSnapShot5.tirarPrintsDeAcerto("Cadastro bem sucedido ", driver);
	
	}
	
}
