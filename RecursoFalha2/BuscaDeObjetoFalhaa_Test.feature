Feature: esse recurso testara a compra de um produto

@Busca_por_Produto
Scenario: Teste de falha bem-sucedido 
	Given o usuario esta na Pagina inicial 
	When o usuario clica em Caixas de som 
	And o usuario escolhe a sua caixa de som
	And o usuario adiciona a quantidade escolhida 
	Then o usuario nao consegue da continuidade
	
	
     