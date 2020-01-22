Feature: esse recurso testara a compra de um produto

@Busca_de_objeto
Scenario: Compra bem-sucedido 
	Given o usuario esta na Pagina compra
	When o usuario clica em LAPTOPS 
	And o usuario clica no laptop escolhido 
	And o usuario adiciona no carrinho
	Then o usuario clica em check
	
	
     