package TestScript;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class SampleTest1 {

	@Test
	
	public void test() {
		Reporter.log("Sample1Test executed",true);
	}
	
	@Test
	public void test1() {
		Reporter.log("Sample1Test1 executed",true);
	}
}
