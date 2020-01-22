package br.com.rsinet.hub_BDD.RunnerFalha;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = "C:\\Users\\gehaime.silva\\Documents\\projeto\\WorkSpace\\AdvantageBDDTest\\WorkSpace\\AdvantageBDD\\RecursoFalha2\\BuscaDeObjetoFalhaa_Test.feature",
		glue = "br.com.rsinet.hub_BDD.AdvantageBDDFalha",
		monochrome = true,
		dryRun = false,
		tags = {"@Busca_por_Produto"
		}
		)

public class BuscaDeObjetoRunnerFalha {
	

}
