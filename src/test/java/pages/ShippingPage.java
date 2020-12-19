package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.BasePage;

public class ShippingPage extends BasePage {

	public ShippingPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//input[@id='cgv']")
	public WebElement checkedAgreement;
	
	@FindBy(name = "processCarrier")
	public WebElement proceedCarrier;
	
	public void agreeTerms(JavascriptExecutor js) {
		js.executeScript("window.scrollBy(0,500)");
		checkedAgreement.click();
		proceedCarrier.click();
	}

}
