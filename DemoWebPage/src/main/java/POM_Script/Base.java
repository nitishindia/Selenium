package POM_Script;

import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import Generic_Utility.PropertyFileUtility;
import Generic_Utility.WebDriverUtility;

public class Base extends WebDriverUtility{
	

	
	@BeforeSuite
	public void connectionToServer() {
		Reporter.log("Connection to server",true);
	}

	@AfterSuite
	public void disconnectionToServer() {
		Reporter.log("DisConnection to server",true);
	}
	
	@BeforeTest
	public void connectionToDB() {
		Reporter.log("Connection to DataBase",true);
			
	}
	
	@AfterTest
	public void disconnectionToDB() {
		Reporter.log("DisConnection to DataBase",true);
	}
	
	@BeforeClass
	public void openBrowser() throws IOException {
		driver = new ChromeDriver();
		maximize();
		implicitWait();
		String url = PropertyFileUtility.propertyData("url");
		getUrl(url);
		Reporter.log("OpenBrowser",true);
	}
	
	

	@AfterClass
	public void closeBrowser() {
		Reporter.log("CloseBrowser",true);
	}
	
	@BeforeMethod
	public void LogIn() {
		Reporter.log("LogIn successfull",true);
//		driver.findElement(By.linkText("Log in")).click();
//		driver.findElement(By.id("Email")).sendKeys("nitish12345@gmail.com");
//		driver.findElement(By.id("Password")).sendKeys("nitish@123");
//		driver.findElement(By.xpath("//input[@value='Log in']")).click();
	}
	@AfterMethod
	public void logOut() {
		Reporter.log("LogOut successfull",true);
	}

}
