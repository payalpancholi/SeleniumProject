package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
import base.BaseClass;
import pages.ContactUsPage;

public class ContactUsTest extends BaseClass {
	
	@Test
	public void contactUs() {
		
		appLogs.info("contact us test started");
		test.log(LogStatus.INFO, "contact us test started");
		
		contactUsPage = new ContactUsPage(driver);
		test.log(LogStatus.INFO, "Subject Heading selected");
		test.log(LogStatus.INFO, "Order Reference selected");
		test.log(LogStatus.INFO, "Product selected");
		test.log(LogStatus.INFO, "Message entered");
		test.log(LogStatus.INFO, "clicked Send button");
		contactUsPage.sendMessage();
		
		String actual = driver.getTitle();
		String expected = "Contact us - My Store";
		Assert.assertEquals(actual, expected);
		
		test.log(LogStatus.INFO, "contact us test completed");
		appLogs.info("contact us test completed");
		
		
		
	}

}
