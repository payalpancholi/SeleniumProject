package base;

import java.io.IOException;

import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import com.relevantcodes.extentreports.LogStatus;

import utilities.Utilities;

public class CustomListeners extends BaseClass implements ITestListener,ISuiteListener  {
	
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	public void onTestStart(ITestResult result) {
		
		test = reports.startTest(result.getName().toUpperCase());
	}

	public void onTestFailure(ITestResult result) {
		
		try {
			Utilities.captureScreenshot();
		} catch (IOException e) {
			e.printStackTrace();
		}
			//Below is for extent report, it will attach screenshot in the extent report
			test.log(LogStatus.FAIL, result.getName().toUpperCase() + " Failed with exception : " + result.getThrowable());
			test.log(LogStatus.INFO, test.addScreenCapture(Utilities.screenshotName));
			
			reports.endTest(test);
			reports.flush();
		 }

	public void onTestSkipped(ITestResult result) {
		
		test.log(LogStatus.SKIP, result.getName().toUpperCase() + " skipped the test");
		reports.endTest(test);
		reports.flush();
	}
	
	public void onTestSuccess(ITestResult result) {
		
		test.log(LogStatus.PASS, result.getName().toUpperCase() + "TEST is PASS");
		reports.endTest(test);
		reports.flush();
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
	}
	
	public void onStart(ISuite suite) {
		// TODO Auto-generated method stub
		
	}

	public void onFinish(ISuite suite) {
		// TODO Auto-generated method stub
		
	}
}
