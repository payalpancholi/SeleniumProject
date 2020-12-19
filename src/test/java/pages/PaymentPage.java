package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.BasePage;

public class PaymentPage extends BasePage {

	public PaymentPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//a[@title='Pay by bank wire']")
	public WebElement selectPaymentMethod;
	
	@FindBy(xpath = "//span[text() = 'I confirm my order']")
	public WebElement confirmOrder;
	
	@FindBy(xpath = "//a[@href='http://automationpractice.com/index.php?controller=history']")
	public WebElement orderHistory;
	
	@FindBy(xpath = "//a[@href='http://automationpractice.com/index.php?controller=my-account']")
	public WebElement backToMyAccount;
	
	public void doPayment(JavascriptExecutor js) {
		js.executeScript("window.scrollBy(0,500)");
		selectPaymentMethod.click();
		js.executeScript("window.scrollBy(0,500)");
		confirmOrder.click();
	}

}
