package POM_Script;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DigitalDownloadPage {
	
	public DigitalDownloadPage(WebDriver driver) {
		PageFactory.initElements(driver,this);	
	}

	@FindBy (partialLinkText = "Digital downloads")
	private WebElement DigitalDwnld;
	
	@FindBy (xpath = "(//input[@value='Add to cart'])[2]")
	private WebElement ATCmusic2;

	
	public WebElement getDigitalDwnld() {
		return DigitalDwnld;
	}

	public WebElement getATCmusic2() {
		return ATCmusic2;
	}
	
	
}
