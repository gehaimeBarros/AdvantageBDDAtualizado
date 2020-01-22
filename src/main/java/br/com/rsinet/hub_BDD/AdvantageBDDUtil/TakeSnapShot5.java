package br.com.rsinet.hub_BDD.AdvantageBDDUtil;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class TakeSnapShot5 {
public static WebDriver driver;
	
	public static void tirarPrintsDeFalha(String nomeDaImagem, WebDriver driver) throws Exception {
        TakesScreenshot scrShot = ((TakesScreenshot) driver);
        File srcFile = scrShot.getScreenshotAs(OutputType.FILE);
        String imageFileDir = "C:\\Users\\gehaime.silva\\Pictures\\TesteBDDAcertos";
        FileUtils.copyFile(srcFile, new File(imageFileDir, nomeDaImagem + timestamp() + ".png"));
	}
        public static String timestamp() {
        	return new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(new Date());
        } 
        
	}


