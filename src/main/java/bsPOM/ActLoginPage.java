package bsPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import bsUtility.Utilitybs;

public class ActLoginPage {
	@FindBy(xpath = "//a[@class='login-link-text mz-utilitynav-link']") private WebElement ActLoginButton;
	@FindBy(id = "signed-in") private WebElement loginOption;
	//@FindBy()
	
	public ActLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
//	public void popUPHandling(WebDriver driver) {
//		if(okButton.isDisplayed())
//		{
//			UtilityMethos.waitTime(driver, 1000);
//			//Reporter.log("Clicking on Ok Button and close button", true);
//			okButton.click();
//			UtilityMethos.waitTime(driver, 1000);
//			UtilityMethos.scrolling(driver, closeButton);
//			closeButton.click();
//			UtilityMethos.waitTime(driver, 1000);
//		}
//		else
//		{
//			UtilityMethos.waitTime(driver, 1000);
//			//Reporter.log("No popup to handle", true);
//		}
//	}
	public void clickOnActLoginButton(WebDriver driver) {
		ActLoginButton.click();
		Utilitybs.waitTime(driver, 1000);
	}
	
	public void selectLoginOption(WebDriver driver)
	{
		loginOption.click();
		Utilitybs.waitTime(driver, 1000);
	}

}
