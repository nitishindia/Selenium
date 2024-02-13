package TestScript;

import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import POM_Script.Base;

public class SampleTest extends Base {

	
	@Test (dataProvider = "credential")
	public void test(String username, String password) {
		Reporter.log("Sample1Test executed",true);
		
		Reporter.log(username,true);
		Reporter.log(password,true);	
	}
	
	
}
