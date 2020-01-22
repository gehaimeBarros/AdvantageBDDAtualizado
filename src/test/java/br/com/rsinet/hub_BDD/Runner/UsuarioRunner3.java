package br.com.rsinet.hub_BDD.Runner;


import org.junit.runner.RunWith;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = "C:\\Users\\gehaime.silva\\Documents\\projeto\\WorkSpace\\AdvantageBDDTest\\WorkSpace\\AdvantageBDD\\Recurso1\\Usuario_Test.feature",
		glue = "br.com.rsinet.hub_BDD.AdvantageBDD",
		monochrome = true,
		dryRun = false,
		tags = {"@Usuario"
				
		}
		
		
		 )

public class UsuarioRunner3 {
	
	 }

	 