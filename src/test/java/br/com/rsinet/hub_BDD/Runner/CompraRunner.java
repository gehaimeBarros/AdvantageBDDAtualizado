package br.com.rsinet.hub_BDD.Runner;

import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = "C:\\Users\\gehaime.silva\\Documents\\projeto\\WorkSpace\\AdvantageBDDTest\\WorkSpace\\AdvantageBDD\\Recurso2\\BuscaDeObjeto_Test.feature",
		glue = "br.com.rsinet.hub_BDD.AdvantageBDD",
		plugin ="com.cucumber.listener.ExtentCucumberFormatter:C:\\Users\\gehaime.silva\\Pictures\\BDDReports\\CompraBemSucedida.html",
		monochrome = true,
		dryRun = false,
		tags = {"@Busca_de_objeto"
		
		}
		)
public class CompraRunner {
	@AfterClass
	public static void writeExtentReport() {
	Reporter.loadXMLConfig(new File("C:\\Users\\gehaime.silva\\Documents\\projeto\\WorkSpace\\AdvantageBDDTest\\WorkSpace\\AdvantageBDD\\Reporttt.xml"));
}
}
