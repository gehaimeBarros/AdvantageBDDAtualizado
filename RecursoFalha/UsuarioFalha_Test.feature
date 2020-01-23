Feature: esse recurso testara o login e ira gerar uma falha 

@Cadastro_de_cliente 
Scenario: Login falhou com credenciais iguais e senhas erradas 
	Given que usuario esta na Pagina inicial 
	When o usuario clica no menu 
	And o usuario clica criar uma nova Conta 
	And o usuario ira preencher o cadastro com seus dados 
	And o usuario clica em aceito 
	Then o usuario tenta e nao consegue clica em registrar 
	
     