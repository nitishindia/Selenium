package POM_Script;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class ShoppingCart {
	
	public ShoppingCart(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath = "//span[text()='Shopping cart']")
	private WebElement shoppingCart;
	
	@FindBy (id = "termsofservice")
	private WebElement checkbox;
	
	@FindBy (id = "checkout")
	private WebElement checkout;
	
	

	public WebElement getShoppingCart() {
		return shoppingCart;
	}

	public WebElement getCheckbox() {
		return checkbox;
	}

	public WebElement getCheckout() {
		return checkout;
	}
	
	
	

}
