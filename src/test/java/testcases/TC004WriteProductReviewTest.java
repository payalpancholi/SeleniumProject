package testcases;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
import base.BaseClass;
import pages.CategoryPage;
import pages.ProductPage;

public class TC004WriteProductReviewTest extends BaseClass {
	
	@Test
	public void addProductReview() {
		
		Actions actions = new Actions(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		appLogs.info("write product review test started");
		test.log(LogStatus.INFO, "write product review test started");
		
		categoryPage = new CategoryPage(driver);
		test.log(LogStatus.INFO, "clicked on T-Shirt tab");
		test.log(LogStatus.INFO, "moved to the T-Shirt image");
		test.log(LogStatus.INFO, "clicked on MORE button");
		categoryPage.clickMoreBtn(actions, js);
		
		productPage = new ProductPage(driver);
		test.log(LogStatus.INFO, "clicked on Write Review button");
		test.log(LogStatus.INFO, "entered review title");
		test.log(LogStatus.INFO, "entered review content");
		test.log(LogStatus.INFO, "clicked on SEND button");
		test.log(LogStatus.INFO, "clicked on OK button");
		productPage.writeReview("My Review", "Satisfactory");
		
		String actual = driver.getTitle();
		String expected = "Faded Short Sleeve T-shirts - My Store";
		Assert.assertEquals(actual, expected);
		
		test.log(LogStatus.INFO, "write product review test completed");
		appLogs.info("write product review test completed");
	}
}
