package br.com.rsinet.hub_BDD.PageFactoryDeFalha;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

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

	public void usuario(String userName) {
		usuario.sendKeys(userName);
	}

	public void email(String Email) {
		email.sendKeys(Email);
	}

	public void senha(String password) {
		senha.sendKeys(password);
	}

	public void confirmaSenha(String senhas) {
		confirmaSenha.sendKeys(senhas);
	}

	public void nome(String firstname) {
		nome.sendKeys(firstname);
	}

	public void sobrenome(String lastname) {
		sobrenome.sendKeys(lastname);
	}

	public void telefone(String phonenumber) {
		telefone.sendKeys(phonenumber);
	}

	public void pais(String country) {
	new Select(pais).selectByVisibleText("Brazil");
	}

	public void cidade(String city) {
		cidade.sendKeys(city);
	}

	public void endereco(String address) {
		endereco.sendKeys(address);
	}

	public void estado(String state) {
		estado.sendKeys(state);
	}

	public void Cep(String postalcode) {
		Cep.sendKeys(postalcode);
	}

	public void aceito() {
		aceito.click();
	}

	public void registrar() {
		registrar.click();
		
	}

	}



