package bsUtility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

public class Utilitybs {
	public static void ss(WebDriver driver, String fName) throws IOException
	{
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\Shreeyu\\Desktop\\Software Testing\\ScreenShots"+fName+".png");
		FileHandler.copy(src, dest);
		//Reporter.log("Taking ScreenShot", true);
	}
	
	public static void scrolling(WebDriver driver, WebElement element)
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)", element);
	}
	
	public static void waitTime(WebDriver driver, int time)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(time));
	}
	
	public static String readDataFromProperty(String key) throws IOException
	{
		//create obj of Properties Class
		Properties prop = new Properties();
		
		//create object of FileInputstream
		FileInputStream myPropFile = new FileInputStream("C:\\Users\\Shreeyu\\eclipse-workspace\\bs\\bs.properties");
		prop.load(myPropFile);
		String value = prop.getProperty(key);
	//	Reporter.log("reading value of " +key+" from property file", true);
		return value;
	}
	
	public static String readDataFromExcel(int i, int j) throws EncryptedDocumentException, IOException
	{
		File myFile = new File("C:\\Users\\Shreeyu\\Desktop\\Software Testing\\boscovs.xlsx");
		Sheet mySheet = WorkbookFactory.create(myFile).getSheet("Sheet1");
		
		String val = mySheet.getRow(i).getCell(j).getStringCellValue();
		return val;
	
	}
	
	

}
