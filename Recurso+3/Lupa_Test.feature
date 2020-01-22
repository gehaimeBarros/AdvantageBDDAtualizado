Feature: esse recurso testara procura na lupa 

@Busca_em_lupa
Scenario: Busca Objeto em search
	Given o usuario esta na Pagina Inicial de procura
	When o usuario clica em procurar 
	And o usuario vai procurar por tablets
	Then o usuario vai escolher o seu tablet
	
	