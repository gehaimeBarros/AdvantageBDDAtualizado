package br.com.rsinet.hub_BDD.PageFactoryDeFalha;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
//import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Select;

import br.com.rsinet.hub_BDD.AdvantageBDDFerramentas.ConstantFalha;
import br.com.rsinet.hub_BDD.AdvantageBDDFerramentas.ExcelDeFalha;

public class Cadastro4 {
	
	@FindBy(how = How.ID, using = "menuUserSVGPath")
	private WebElement menu;
	@FindBy(how = How.XPATH, using = "/html/body/login-modal/div/div/div[3]/a[2]")
	private WebElement novaConta;
	@FindBy(how = How.NAME, using = "usernameRegisterPage")
	private WebElement usuario;
	@FindBy(how = How.NAME, using = "emailRegisterPage")
	private WebElement email;
	@FindBy(how = How.NAME, using = "passwordRegisterPage")
	private WebElement senha;
	@FindBy(how = How.NAME, using = "confirm_passwordRegisterPage")
	private WebElement confirmaSenha;
	@FindBy(how = How.NAME, using = "first_nameRegisterPage")
	private WebElement nome;
	@FindBy(how = How.NAME, using = "last_nameRegisterPage")
	private WebElement sobrenome;
	@FindBy(how = How.NAME, using = "phone_numberRegisterPage")
	private WebElement telefone;
	@FindBy(how = How.NAME, using = "countryListboxRegisterPage")
	private WebElement pais;
	@FindBy(how = How.NAME, using = "cityRegisterPage")
	private WebElement cidade;
	@FindBy(how = How.NAME, using = "addressRegisterPage")
	private WebElement endereco;
	@FindBy(how = How.NAME, using = "state_/_province_/_regionRegisterPage")
	private WebElement estado;
	@FindBy(how = How.NAME, using = "postal_codeRegisterPage")
	private WebElement Cep;
	@FindBy(how = How.NAME, using = "i_agree")
	private WebElement aceito;
	@FindBy(how = How.ID, using = "register_btnundefined")
	private WebElement registrar;

	public void menu() {
		menu.click();
	}

	public void novaConta() {
		novaConta.sendKeys(Keys.ENTER);
	}
	public void CadastrodeFalha() throws Exception {
		ExcelDeFalha.setExcelFile(ConstantFalha.caminho + ConstantFalha.arquivo, "Planilha1");
		usuario.sendKeys(ExcelDeFalha.getCellData(0, 1));
		email.sendKeys(ExcelDeFalha.getCellData(1, 1));
		senha.sendKeys(ExcelDeFalha.getCellData(2, 1));
		confirmaSenha.sendKeys(ExcelDeFalha.getCellData(3, 1));
		nome.sendKeys(ExcelDeFalha.getCellData(4, 1));
		sobrenome.sendKeys(ExcelDeFalha.getCellData(5, 1));
		telefone.sendKeys(ExcelDeFalha.getCellData(6, 1));
		new Select(pais).selectByVisibleText(ExcelDeFalha.getCellData(7, 1));
		cidade.sendKeys(ExcelDeFalha.getCellData(8, 1));
		endereco.sendKeys(ExcelDeFalha.getCellData(9, 1));
		estado.sendKeys(ExcelDeFalha.getCellData(10, 1));
		Cep.sendKeys(ExcelDeFalha.getCellData(11, 1));


	}

	public void aceito() {
		aceito.click();
	}

	public void registrar() {
		registrar.click();
		
	}

	}



