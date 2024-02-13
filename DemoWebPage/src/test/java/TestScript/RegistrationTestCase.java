package TestScript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Generic_Utility.ReadExcelUtility;
import POM_Script.Base;
import POM_Script.RegisterPage;
import POM_Script.WelcomePage;

public class RegistrationTestCase extends Base {
	

	@Test(dataProvider = "credential")
	public void testcase(String fn,String ln, String email, String psd, String compsd) {
		WelcomePage w = new WelcomePage(driver);
		w.getReglink().click();
		RegisterPage r = new RegisterPage(driver);
		r.getMale().click();
		r.getFstname().sendKeys(fn);
		r.getLstname().sendKeys(ln);
		r.getEmailid().sendKeys(email);
		r.getPswd().sendKeys(psd);
		r.getConpawd().sendKeys(compsd);
		r.getRegbutton().click();
		WelcomePage w1 = new WelcomePage(driver);
		w1.getLogoutlink().click();
	}
	
	@DataProvider (name = "credential")
	public Object[][]data() throws EncryptedDocumentException, IOException{
		return ReadExcelUtility.fetchAllData("sheet2");
	}
}
