Feature: esse recurso testara as funcionalidades de login e ira gerar uma falha

@Cadastro_de_cliente
Scenario: Login falhou com credenciais iguais e senhas erradas
	Given que usuario esta na Pagina inicial 
	When o usuario clica no menu 
	And o usuario clica em novaConta 
	And o usuario digita o nome de usuario "Gehaime9731"
	And o usuario digita o email "gehaime.silva@rsinet.com.br"
	And o usuario digita o senha "Geh@201992727272722"
	And o usuario digita o confirmaSenha "Geh@201992727272722"
	And o usuario digita o nome "Gehaime"
	And o usuario digita o sobrenome "Barros"
	And o usuario digita o telefone "945631734"
	And o usuario digita o pais "Brazil"
	And o usuario digita o nome de cidade "Osasco"
	And o usuario digita o endereco "Intercap"
	And o usuario digita o nome de estado "Sao paulo"
	And o usuario digita o Cep "04322-255"
	And o usuario clica em aceito	
	Then o usuario tenta e nao consegue clica em registrar 
	
     