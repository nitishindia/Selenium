package POM_Script;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOutPage {
	
	public CheckOutPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (id = "BillingNewAddress_Company")
	private WebElement company;
	
	@FindBy (id = "BillingNewAddress_CountryId")
	private WebElement country;
	
	@FindBy (xpath = "//option[text()='India']")
	private WebElement india;
	
	@FindBy (id = "BillingNewAddress_City")
	private WebElement city;
	
	@FindBy (id = "BillingNewAddress_Address1")
	private WebElement add1;
	
	@FindBy (id = "BillingNewAddress_Address2")
	private WebElement add2;
	
	@FindBy (id = "BillingNewAddress_ZipPostalCode")
	private WebElement ZipCode;
	
	@FindBy (id = "BillingNewAddress_PhoneNumber")
	private WebElement phNo;
	
	@FindBy (id = "BillingNewAddress_FaxNumber")
	private WebElement faxNo;
	
	@FindBy (xpath = "//input[@title='Continue']")
	private WebElement continu;

	public WebElement getCompany() {
		return company;
	}

	public WebElement getCountry() {
		return country;
	}

	public WebElement getIndia() {
		return india;
	}

	public WebElement getCity() {
		return city;
	}

	public WebElement getAdd1() {
		return add1;
	}

	public WebElement getAdd2() {
		return add2;
	}

	public WebElement getZipCode() {
		return ZipCode;
	}

	public WebElement getPhNo() {
		return phNo;
	}

	public WebElement getFaxNo() {
		return faxNo;
	}

	public WebElement getContinu() {
		return continu;
	}
	
	
	

}
