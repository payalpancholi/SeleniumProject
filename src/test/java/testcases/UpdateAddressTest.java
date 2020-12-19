package testcases;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
import base.BaseClass;
import pages.MyAccountPage;

public class UpdateAddressTest extends BaseClass {
	
	@Test
	public void updateAddress() {
		
	JavascriptExecutor js = (JavascriptExecutor) driver;
	
	appLogs.info("update address test started");
	test.log(LogStatus.INFO, "update address test started");
	
	myAccountPage = new MyAccountPage(driver);
	test.log(LogStatus.INFO, "clicked on MY ADDRESS link");
	test.log(LogStatus.INFO, "clicked on UPDATE button");
	test.log(LogStatus.INFO, "entered new address");
	test.log(LogStatus.INFO, "entered city name");
	test.log(LogStatus.INFO, "state selected from the dropdown list");
	test.log(LogStatus.INFO, "entered postal code");
	test.log(LogStatus.INFO, "clicked on Save button");
	myAccountPage.changeAddress(js,"Time Squre","Manhattan","New York","10036");
	
	String actual = driver.getTitle();
	String expected = "Addresses - My Store";
	Assert.assertEquals(actual, expected);
	
	test.log(LogStatus.INFO, "update address test completed");
	appLogs.info("update address test completed");
	}
}
