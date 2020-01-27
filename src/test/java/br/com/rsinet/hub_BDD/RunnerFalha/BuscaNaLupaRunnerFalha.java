package br.com.rsinet.hub_BDD.RunnerFalha;

import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = "C:\\Users\\gehaime.silva\\Documents\\projeto\\WorkSpace\\AdvantageBDDTest\\WorkSpace\\AdvantageBDD\\RecursoFalha3\\BuscaNaLupaFalhas_Test.feature",
		glue = "br.com.rsinet.hub_BDD.AdvantageBDDFalha",
		plugin ="com.cucumber.listener.ExtentCucumberFormatter:C:\\Users\\gehaime.silva\\Pictures\\BDDReport.Falha\\BuscaNaLupaFalha.html",
		monochrome = true,
		dryRun = false,
		tags = {"@Busca_produto_na_lupa"
		}
		)
public class BuscaNaLupaRunnerFalha {
	@AfterClass
	public static void writeExtentReport() {
	Reporter.loadXMLConfig(new File("C:\\Users\\gehaime.silva\\Documents\\projeto\\WorkSpace\\AdvantageBDDTest\\WorkSpace\\AdvantageBDD\\Reporttt.xml"));	
}
}
