package TestScript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Generic_Utility.ReadExcelUtility;
import POM_Script.Base;
import POM_Script.CheckOutPage;
import POM_Script.DigitalDownloadPage;
import POM_Script.LogInPage;
import POM_Script.ShoppingCart;
import POM_Script.WelcomePage;

public class endtoendTest extends Base {

	@Test (dataProvider = "credential")
	public void testcase1(String email, String pswd) {
		
		WelcomePage w = new WelcomePage(driver);
		w.getLoginlink().click();
		
		LogInPage l = new LogInPage(driver);
		l.getMail().sendKeys(email);
		l.getPsd().sendKeys(pswd);
		l.getLoginbutton().click();
	}
	
	@DataProvider(name = "credential")
	public Object [][]data1() throws EncryptedDocumentException, IOException{
		return ReadExcelUtility.fetchAllData("Sheet3");
	}
	
	@Test
	public void testcase2() {
		DigitalDownloadPage d = new DigitalDownloadPage(driver);
		d.getDigitalDwnld().click();
		d.getATCmusic2().click();
	}


	
	@Test
	public void testcase3() {
		ShoppingCart s = new ShoppingCart(driver);
		s.getShoppingCart().click();
		s.getCheckbox().click();
		s.getCheckout().click();
	}
	
	@Test(dataProvider = "credential1")
	public void testcase4(String Company, String city, String add1, String add2, String zipcode, String phoneNo, String fax) {
		CheckOutPage c = new CheckOutPage(driver);
		c.getCompany().sendKeys(Company);
		c.getCountry().click();
		c.getIndia().click();
		c.getCity().sendKeys(city);
		c.getAdd1().sendKeys(add1);
		c.getAdd2().sendKeys(add2);
		c.getZipCode().sendKeys(zipcode);
		c.getPhNo().sendKeys(phoneNo);
		c.getFaxNo().sendKeys(fax);
		c.getContinu().click();
		
	}
	
	
	@DataProvider(name = "credential1")
	public Object [][]data() throws EncryptedDocumentException, IOException{
		return ReadExcelUtility.fetchAllData("Sheet4");
	}
}
