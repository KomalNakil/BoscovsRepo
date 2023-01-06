package bsTest;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import bsBase.BaseClassbs;
import bsPOM.ActLoginPage;
import bsPOM.LoginPage;
import bsUtility.Utilitybs;

public class TestClassbs extends BaseClassbs{
	
	ActLoginPage alp;
	LoginPage lp;
	
	@BeforeClass
	public void launchBrowser() throws EncryptedDocumentException, IOException
	{
		launchBs();
		alp = new ActLoginPage(driver);
		lp = new LoginPage(driver);
	}
	
	@BeforeMethod
	public void loginToBoscovs() throws IOException 
	{
		Utilitybs.waitTime(driver, 2000);
		alp.clickOnActLoginButton(driver);
		Utilitybs.waitTime(driver, 1000);
		alp.selectLoginOption(driver);
		lp.sendEmail();
		Utilitybs.waitTime(driver, 1000);
		lp.sendPw();
		Utilitybs.waitTime(driver, 1000);
		lp.clickOnLoginButton();
		Utilitybs.waitTime(driver, 1000);
		
	}
	
	
  @Test
  public void f() {
	  Reporter.log("testing",true);
  }
}
