package br.com.rsinet.hub_BDD.AdvantageBDDFalha;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
//import org.openqa.selenium.support.ui.Select;

import br.com.rsinet.hub_BDD.AdvantageBDDUtil.TakeSnapShot3;
//import br.com.rsinet.hub_BDD.PageFactory.CadastroUsu;
import br.com.rsinet.hub_BDD.PageFactoryDeFalha.Cadastro4;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Cadastro3 {
private WebDriver driver = new ChromeDriver();
	
	private Cadastro4 cadastroCliente;
	
	@Given("^que usuario esta na Pagina inicial$")
	public void que_usuario_esta_na_Pagina_inicial() throws Throwable {
		
		cadastroCliente = PageFactory.initElements(driver, Cadastro4.class);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		driver.get("https://www.advantageonlineshopping.com/#/");
	}

	@When("^o usuario clica no menu$")
	public void o_usuario_clica_no_menu() throws Throwable {
	    cadastroCliente.menu();
	}

	@When("^o usuario clica em novaConta$")
	public void o_usuario_clica_em_novaConta() throws Throwable {
	    cadastroCliente.novaConta();
	}

	@When("^o usuario digita o nome de usuario \"([^\"]*)\"$")
	public void o_usuario_digita_o_nome_de_usuario(String userName) throws Throwable {
	   cadastroCliente.usuario(userName);
	}

	@When("^o usuario digita o email \"([^\"]*)\"$")
	public void o_usuario_digita_o_email(String Email) throws Throwable {
	    cadastroCliente.email(Email);
	}

	@When("^o usuario digita o senha \"([^\"]*)\"$")
	public void o_usuario_digita_o_senha(String password) throws Throwable {
	   cadastroCliente.senha(password);
	}

	@When("^o usuario digita o confirmaSenha \"([^\"]*)\"$")
	public void o_usuario_digita_o_confirmaSenha(String senhas) throws Throwable {
	    cadastroCliente.confirmaSenha(senhas);
	    TakeSnapShot3.tirarPrintsDeFalha("CadastroFalha ", driver);
	}

	@When("^o usuario digita o nome \"([^\"]*)\"$")
	public void o_usuario_digita_o_nome(String firstname) throws Throwable {
	    cadastroCliente.nome(firstname);
	}

	@When("^o usuario digita o sobrenome \"([^\"]*)\"$")
	public void o_usuario_digita_o_sobrenome(String lastname) throws Throwable {
	    cadastroCliente.sobrenome(lastname);
	}

	@When("^o usuario digita o telefone \"([^\"]*)\"$")
	public void o_usuario_digita_o_telefone(String phonenumber) throws Throwable {
	    cadastroCliente.telefone(phonenumber);
	}

	@When("^o usuario digita o pais \"([^\"]*)\"$")
	public void o_usuario_digita_o_pais(String country) throws Throwable {
	    cadastroCliente.pais(country);
	}

	@When("^o usuario digita o nome de cidade \"([^\"]*)\"$")
	public void o_usuario_digita_o_nome_de_cidade(String city) throws Throwable {
	    cadastroCliente.cidade(city);
	}

	@When("^o usuario digita o endereco \"([^\"]*)\"$")
	public void o_usuario_digita_o_endereco(String address) throws Throwable {
	    cadastroCliente.endereco(address);
	}

	@When("^o usuario digita o nome de estado \"([^\"]*)\"$")
	public void o_usuario_digita_o_nome_de_estado(String state) throws Throwable {
	    cadastroCliente.estado(state);
	}

	@When("^o usuario digita o Cep \"([^\"]*)\"$")
	public void o_usuario_digita_o_Cep(String postalcode) throws Throwable {
	    cadastroCliente.Cep(postalcode);
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

	}
}

