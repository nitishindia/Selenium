package POM_Script;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class RegisterPage {
	
	public RegisterPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(id = "gender-male")
	private WebElement male;
	
	@FindBy (id = "FirstName")
	private WebElement fstname;
	
	@FindBy (id = "LastName")
	private WebElement lstname;
	
	@FindBy (id = "Email")
	private WebElement emailid;
	
	@FindBy (id = "Password")
	private WebElement pswd;
	
	@FindBy (id = "ConfirmPassword")
	private WebElement conpawd;
	
	@FindBy (id = "register-button")
	private WebElement regbutton;
	
	

	public WebElement getMale() {
		return male;
	}

	public WebElement getFstname() {
		return fstname;
	}

	public WebElement getLstname() {
		return lstname;
	}

	public WebElement getEmailid() {
		return emailid;
	}

	public WebElement getPswd() {
		return pswd;
	}

	public WebElement getConpawd() {
		return conpawd;
	}
	public WebElement getRegbutton() {
		return regbutton;
	}
	
	
}
