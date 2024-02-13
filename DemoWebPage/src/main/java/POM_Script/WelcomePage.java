package POM_Script;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage {
	public WelcomePage(WebDriver driver ) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (linkText = "Register")
	private WebElement reglink;
	
	@FindBy (linkText = "Log in")
	private WebElement loginlink;
	
	@FindBy (linkText = "Log out")
	private WebElement logoutlink;
	

	@FindBy (xpath = "//span[text()='Shopping cart']")
	private WebElement shoppingCartLink;

	
	public WebElement getReglink() {
		return reglink;
	}

	public WebElement getLoginlink() {
		return loginlink;
	}
	
	public WebElement getLogoutlink() {
		return logoutlink;
	}

	public WebElement getShoppingCartLink() {
		return shoppingCartLink;
	}
}
