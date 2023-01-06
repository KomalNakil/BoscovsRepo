package bsBase;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import bsUtility.Utilitybs;

public class BaseClassbs {
	protected static WebDriver driver;
	public void launchBs() throws EncryptedDocumentException, IOException
	{
		//this is base class
		System.setProperty("Webdriver.chrome.driver", "C:\\Testing Project\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(Utilitybs.readDataFromProperty("url"));
		Utilitybs.waitTime(driver, 1000);
		driver.manage().window().maximize();
	}

}
