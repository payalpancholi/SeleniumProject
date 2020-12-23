package testcases;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;

import base.BaseClass;
import pages.AddressPage;
import pages.CategoryPage;
import pages.OrderSummaryPage;
import pages.PaymentPage;
import pages.ShippingPage;

public class TC002BuyingProductTest extends BaseClass {
	
	@Test
	public void buyProduct() {
		
		Actions actions = new Actions(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		appLogs.info("Buying product test started");
		test.log(LogStatus.INFO, "Buying product test started");
		categoryPage = new CategoryPage(driver);
		test.log(LogStatus.INFO, "moved to DRESSES tab ");
		test.log(LogStatus.INFO, "clicked on SUMMER DRESSES option");
		test.log(LogStatus.INFO, "clicked on ADD TO CART button");
		test.log(LogStatus.INFO, "clicked on PROCEED TO CHECKOUT button");
		categoryPage.selectProductCategory(actions,js);
		
		orderSummaryPage = new OrderSummaryPage(driver);
		test.log(LogStatus.INFO, "clicked on '+' button to increase the product quantity");
		test.log(LogStatus.INFO, "clicked on PROCEED TO CHECKOUT button");
		orderSummaryPage.orderDetails(js);
		
		addressPage = new AddressPage(driver);
		test.log(LogStatus.INFO, "wrote a Message/Comment for the product");
		test.log(LogStatus.INFO, "clicked on PROCEED TO CHECKOUT button");
		addressPage.getAddress(js, "Nice Service");
		
		shippingPage = new ShippingPage(driver);
		test.log(LogStatus.INFO, "checked the checkbox of Terms & Conditions");
		test.log(LogStatus.INFO, "clicked on PROCEED TO CHECKOUT button");
		shippingPage.agreeTerms(js);
		
		paymentPage = new PaymentPage(driver);
		test.log(LogStatus.INFO, "payment method selected");
		test.log(LogStatus.INFO, "clicked to the ORDER CONFIRMATION button");
		paymentPage.doPayment(js);
		
		String actual = driver.getTitle();
		String expected = "Order confirmation - My Store";
		Assert.assertEquals(actual, expected);
		
		test.log(LogStatus.INFO, "Buying product test completed");
		appLogs.info("Buying product test completed");
		
	}
}
