package br.com.rsinet.hub_BDD.AdvantageBDDFerramentas;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverFactory {
	private DriverFactory() {
	}
	public static WebDriver inicializador() {
		WebDriver driver = null;
		if(driver==null) {
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
			driver.get("https://www.advantageonlineshopping.com/#/");
			
		}
		return driver;
		
	}
	public static void Quit(WebDriver driver) {
		if(driver !=null ) {
			driver.quit();
			driver=null;
		}
	}
	

}
