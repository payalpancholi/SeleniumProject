package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.BasePage;

public class AddressPage extends BasePage {

	public AddressPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(name = "message")
	public WebElement comment;
	
	@FindBy(name = "processAddress")
	public WebElement proceedAddress;
	
	public void getAddress(JavascriptExecutor js, String message) {
		js.executeScript("window.scrollBy(0,700)");
		comment.sendKeys(message);
		proceedAddress.click();
	}

}
