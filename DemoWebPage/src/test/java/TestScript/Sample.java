package TestScript;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Sample {

	@Test
	public void test() {
		Reporter.log("Sample executed",true);
	}
}
