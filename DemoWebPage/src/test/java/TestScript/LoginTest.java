package TestScript;

import org.testng.Reporter;
import org.testng.annotations.Test;

import POM_Script.WelcomePage;

public class LoginTest{
	
	@Test
	public void testCase() {
		 String username = System.getProperty("username");
		String password = System.getProperty("password");
		
		Reporter.log(username,true);
		Reporter.log(password,true);
//		WelcomePage w = new WelcomePage(driver);
//		w.getLoginlink().click(); 
		
		
	
		
		
	}

}
