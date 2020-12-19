package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import base.BasePage;

public class OrderSummaryPage extends BasePage {
	
	public OrderSummaryPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[5]/div[1]/a[2]/span[1]/i[1]")
	public WebElement increaseQty;
	
	@FindBy(xpath = "//a[@href='http://automationpractice.com/index.php?controller=order&step=1']")
	public WebElement proceedToCheckOut;
	
	public void orderDetails(JavascriptExecutor js) {
		js.executeScript("window.scrollBy(0,500)");
		increaseQty.click();
		js.executeScript("window.scrollBy(0,500)");
		proceedToCheckOut.click();
	}
}
