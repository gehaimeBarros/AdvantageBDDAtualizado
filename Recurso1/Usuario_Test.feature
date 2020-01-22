Feature: esse recurso testara as funcionalidades de login 

@Usuario
Scenario: Login bem-sucedido com credenciais validas 
	Given o usuario esta na Pagina inicial Advantage
	When o usuario clica no menu 
	And o usuario clica em novaConta 
	And o usuario preenche o cadastro 
	And o usuario clica em aceito	
	Then o usuario clica em registrar
	
     