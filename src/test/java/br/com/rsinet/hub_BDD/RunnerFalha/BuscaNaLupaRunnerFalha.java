package br.com.rsinet.hub_BDD.RunnerFalha;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = "C:\\Users\\gehaime.silva\\Documents\\projeto\\WorkSpace\\AdvantageBDDTest\\WorkSpace\\AdvantageBDD\\RecursoFalha3\\BuscaNaLupaFalhas_Test.feature",
		glue = "br.com.rsinet.hub_BDD.AdvantageBDDFalha",
		monochrome = true,
		dryRun = false,
		tags = {"@Busca_produto_na_lupa"
		}
		)
public class BuscaNaLupaRunnerFalha {
	

}
