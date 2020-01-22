package br.com.rsinet.hub_BDD.AdvantageBDD;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import br.com.rsinet.hub_BDD.AdvantageBDDUtil.TakeSnapShot3;
import br.com.rsinet.hub_BDD.PageFactory.CadastroUsu;
import br.com.rsinet.hub_BDD.PageFactoryDeFalha.Cadastro4;
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

	@When("^o usuario digita o nome de usuario \"([^\"]*)\"$")
	public void o_usu_rio_digita_o_nome_de_usu_rio(String usuario) throws Throwable {
		cadastroUsuario.usuario(usuario);
	}

	@When("^o usuario digita o email \"([^\"]*)\"$")
	public void o_usu_rio_digita_o_email(String Email) throws Throwable {
		cadastroUsuario.email(Email);
	}

	@When("^o usuario digita o senha \"([^\"]*)\"$")
	public void o_usu_rio_digita_o_senha(String password) throws Throwable {
		cadastroUsuario.senha(password);
	}
	
	@When("^o usuario digita o confirmaSenha \"([^\"]*)\"$")
	public void o_usu_rio_digita_o_confirmaSenha(String senhas) throws Throwable {
		cadastroUsuario.confirmaSenha(senhas);
	}

	@When("^o usuario digita o nome \"([^\"]*)\"$")
	public void o_usu_rio_digita_o_nome(String firstname) throws Throwable {
		cadastroUsuario.nome(firstname);
	}

	@When("^o usuario digita o sobrenome \"([^\"]*)\"$")
	public void o_usu_rio_digita_o_sobrenome(String lastname) throws Throwable {
		cadastroUsuario.sobrenome(lastname);
	}

	@When("^o usuario digita o telefone \"([^\"]*)\"$")
	public void o_usu_rio_digita_o_telefone(String phonenumber) throws Throwable {
		cadastroUsuario.telefone(phonenumber);
	}

	@When("^o usuario digita o pais \"([^\"]*)\"$")
	public void o_usu_rio_digita_o_pais(String country) throws Throwable {
		cadastroUsuario.pais(country);
	}

	@When("^o usuario digita o nome de cidade \"([^\"]*)\"$")
	public void o_usu_rio_digita_o_nome_de_cidade(String city) throws Throwable {
		cadastroUsuario.cidade(city);
	}

	@When("^o usuario digita o endereco \"([^\"]*)\"$")
	public void o_usu_rio_digita_o_endere_o(String address) throws Throwable {
		cadastroUsuario.endereco(address);
	}

	@When("^o usuario digita o nome de estado \"([^\"]*)\"$")
	public void o_usu_rio_digita_o_nome_de_estado(String state) throws Throwable {
		cadastroUsuario.estado(state);
	}

	@When("^o usuario digita o Cep \"([^\"]*)\"$")
	public void o_usu_rio_digita_o_Cep(String postalcode) throws Throwable {
		cadastroUsuario.Cep(postalcode);
	}

	@When("^o usuario clica em aceito$")
	public void o_usu_rio_clica_em_aceito() throws Throwable {
		cadastroUsuario.aceito();
	}

	@Then("^o usuario clica em registrar$")
	public void o_usuario_clica_em_registrar() throws Throwable {
		cadastroUsuario.registrar();
	}
	
}
