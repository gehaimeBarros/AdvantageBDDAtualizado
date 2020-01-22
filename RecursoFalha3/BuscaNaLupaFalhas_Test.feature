Feature: esse recurso testara procura na lupa e irá gerar um erro de busca

@Busca_produto_na_lupa
Scenario: Busca Objeto em search
	Given o usuario esta na Pagina Inicial 
	When o usuario clica em procurar 
	And o usuario vai procurar por xiaomi
	Then o usuario nao consegue achar o produto 
	
	
     