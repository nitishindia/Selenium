package POM_Script;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;



public class LogInPage {
	
	public LogInPage(WebDriver driver) {
		PageFactory.initElements(driver, this);	
	}
	
	@FindBy (id = "Email")
	private WebElement mail;
	
	@FindBy (id = "Password")
	private WebElement psd;
	
	@FindBy (xpath = "//input[@value='Log in']")
	private WebElement loginbutton;
	

	public WebElement getMail() {
		return mail;
	}

	public WebElement getPsd() {
		return psd;
	}

	public WebElement getLoginbutton() {
		return loginbutton;
	}
	
	
	
	

}
