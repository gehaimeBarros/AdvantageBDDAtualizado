package br.com.rsinet.hub_BDD.Runner;


import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = "C:\\Users\\gehaime.silva\\Documents\\projeto\\WorkSpace\\AdvantageBDDTest\\WorkSpace\\AdvantageBDD\\Recurso1\\Usuario_Test.feature",
		glue = "br.com.rsinet.hub_BDD.AdvantageBDD",
		plugin ="com.cucumber.listener.ExtentCucumberFormatter:C:\\Users\\gehaime.silva\\Pictures\\BDDReports\\CadastroBemSucedido.html",
		monochrome = true,
		dryRun = false,
		tags = {"@Usuario"
				
		}
		
		
		 )

public class UsuarioRunner3 {
	
	@AfterClass
	public static void writeExtentReport() {
	Reporter.loadXMLConfig(new File("C:\\Users\\gehaime.silva\\Documents\\projeto\\WorkSpace\\AdvantageBDDTest\\WorkSpace\\AdvantageBDD\\Reporttt.xml"));
	 }

}

	

	 