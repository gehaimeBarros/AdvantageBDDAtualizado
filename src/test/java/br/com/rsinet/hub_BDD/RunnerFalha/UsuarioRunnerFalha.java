package br.com.rsinet.hub_BDD.RunnerFalha;

import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = "C:\\Users\\gehaime.silva\\Documents\\projeto\\WorkSpace\\AdvantageBDDTest\\WorkSpace\\AdvantageBDD\\RecursoFalha\\UsuarioFalha_Test.feature",
		glue = "br.com.rsinet.hub_BDD.AdvantageBDDFalha",
		plugin ="com.cucumber.listener.ExtentCucumberFormatter:C:\\Users\\gehaime.silva\\Pictures\\BDDReport.Falha\\CadastroDeuFalha.html",
		monochrome = true,
		dryRun = false,
		tags = {"@Cadastro_de_cliente" 
		}
		)

public class UsuarioRunnerFalha {
	@AfterClass
	public static void writeExtentReport() {
	Reporter.loadXMLConfig(new File("C:\\Users\\gehaime.silva\\Documents\\projeto\\WorkSpace\\AdvantageBDDTest\\WorkSpace\\AdvantageBDD\\Reporttt.xml"));	
}
}

