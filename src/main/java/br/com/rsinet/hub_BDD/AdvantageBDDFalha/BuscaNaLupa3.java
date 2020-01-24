package br.com.rsinet.hub_BDD.AdvantageBDDFalha;


import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import br.com.rsinet.hub_BDD.AdvantageBDDFerramentas.DriverFactory;
import br.com.rsinet.hub_BDD.AdvantageBDDUtil.TakeSnapShot3;
import br.com.rsinet.hub_BDD.PageFactoryDeFalha.BuscaNaLupaS;
//import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BuscaNaLupa3 {

	private WebDriver driver = new ChromeDriver();
	
	private BuscaNaLupaS buscadeProduto;
	@Given("^o usuario esta na Pagina Inicial$")
	public void o_usuario_esta_na_Pagina_Inicial() throws Throwable {
		driver=DriverFactory.inicializador();
	    buscadeProduto = PageFactory.initElements(driver, BuscaNaLupaS.class);
	    	}

	@When("^o usuario clica em procurar$")
	public void o_usuario_clica_em_procurar() throws Throwable {
	   buscadeProduto.search();
	}

	@When("^o usuario vai procurar por xiaomi$")
	public void o_usuario_vai_procurar_por_xiaomi() throws Throwable {
	    buscadeProduto.Completa();
	}

	@Then("^o usuario nao consegue achar o produto$")
	public void o_usuario_nao_consegue_achar_o_produto() throws Throwable {
		String resposta = driver.findElement(By.xpath("//*[@id=\"searchPage\"]/div[3]/div/label/span")).getText();
		System.out.println(resposta);
		Assert.assertFalse("No results for xiaomi",resposta.equals("Produto nao encontrado"));
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("scrollBy(0,400)", "");
		JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeAsyncScript("window.setTimeout(arguments[arguments.length - 1], 2000);");
		TakeSnapShot3.tirarPrintsDeFalha("Busca na lupa falha ", driver);
		DriverFactory.Quit(driver);
	}
}

