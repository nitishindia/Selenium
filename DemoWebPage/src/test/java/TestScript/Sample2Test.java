package TestScript;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Sample2Test {
	
	@Test
	public void testcase() {
		
		ExtentSparkReporter esr = new ExtentSparkReporter("C:\\Users\\dell\\eclipse-workspace\\DemoWebPage\\ExtentReport\\Report.html");
		
		ExtentReports er = new ExtentReports();
		
		er.attachReporter(esr);
		
		ExtentTest et=er.createTest("Sample2Test");
		et.log(Status.INFO, "Extent report Test case is executed ");
		er.flush();
	}

}
