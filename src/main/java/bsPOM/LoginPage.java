package bsPOM;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import bsUtility.Utilitybs;

public class LoginPage {
	@FindBy(xpath="(//input[@type='email'])[2]") private WebElement emailField;
	@FindBy(xpath="(//input[@type='password'])[1]") private WebElement pwField;
	@FindBy(xpath="//button[text()='Login']") private WebElement loginButton;
	
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void sendEmail() throws IOException
	{
		emailField.sendKeys(Utilitybs.readDataFromProperty("email"));
	}
	
	public void sendPw() throws IOException
	{
		pwField.sendKeys(Utilitybs.readDataFromProperty("pw"));
	}
	
	public void clickOnLoginButton()
	{
		loginButton.click();
	}

}
