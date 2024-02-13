package TestScript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Generic_Utility.ReadExcelUtility;
import POM_Script.Base;
import POM_Script.LogInPage;
import POM_Script.WelcomePage;

public class LogInTestCase extends Base {
	
	@Test (dataProvider = "credential")
	public void testcase(String email, String pswd) {
		
		WelcomePage w = new WelcomePage(driver);
		w.getLoginlink().click();
		
		LogInPage l = new LogInPage(driver);
		l.getMail().sendKeys(email);
		l.getPsd().sendKeys(pswd);
		l.getLoginbutton().click();
	}
	
	@DataProvider(name = "credential")
	public Object [][]data() throws EncryptedDocumentException, IOException{
		return ReadExcelUtility.fetchAllData("Sheet3");
	}
	

}
