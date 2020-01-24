package br.com.rsinet.hub_BDD.AdvantageBDDFalha;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import br.com.rsinet.hub_BDD.AdvantageBDDFerramentas.DriverFactory;
import br.com.rsinet.hub_BDD.AdvantageBDDUtil.TakeSnapShot3;
import br.com.rsinet.hub_BDD.PageFactoryDeFalha.BuscaDeObjeto8;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BuscaDeObjeto3 {
	private WebDriver driver;
	
	private BuscaDeObjeto8 buscaporobjetos;

	@Given("^o usuario esta na Pagina inicial$")
	public void o_usuario_esta_na_Pagina_inicial() throws Throwable {
		driver=DriverFactory.inicializador();
		buscaporobjetos = PageFactory.initElements(driver,BuscaDeObjeto8.class);
			}

	@When("^o usuario clica em Caixas de som$")
	public void o_usuario_clica_em_Caixas_de_som() throws Throwable {
	    buscaporobjetos.caixadesom();
	}

	@When("^o usuario escolhe a sua caixa de som$")
	public void o_usuario_escolhe_a_sua_caixa_de_som() throws Throwable {
	    buscaporobjetos.ALTOFALANTEHPS9500();
	}

	@When("^o usuario adiciona a quantidade escolhida$")
	public void o_usuario_adiciona_a_quantidade_escolhida() throws Throwable {
	   buscaporobjetos.quantidade();
	}

	@Then("^o usuario nao consegue da continuidade$")
	public void o_usuario_nao_consegue_da_continuidade() throws Throwable {
	    buscaporobjetos.AddNoCarrinho();
	    TakeSnapShot3.tirarPrintsDeFalha("CompraFalhou ", driver);
	    String resposta = driver.findElement(By.xpath("/html/body/div[3]/section/article[1]/div[2]/div[2]/div/label")).getText();
		System.out.println(resposta);
		Assert.assertFalse("Oops! We only have 10 in stock",resposta.equals("ultrapasso o limite em estoque"));
		DriverFactory.Quit(driver);
	}
}

