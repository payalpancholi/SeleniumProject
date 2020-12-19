package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import base.BasePage;

public class ContactUsPage extends BasePage {

	public ContactUsPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(linkText = "Contact us")
	public WebElement contactUsLink;
	
	@FindBy(id="id_contact")
	public WebElement selectSubjectHeading;
	
	@FindBy(name="id_order")
	public WebElement selectOrderReference;
	
	@FindBy(id="268015_order_products")
	public WebElement product;
	
	@FindBy(id="message")
	public WebElement messageTxt;
	
	@FindBy(id="submitMessage")
	public WebElement sendBtn;
	
	public void sendMessage() {
		
		contactUsLink.click();
		Select selectSubject = new Select(selectSubjectHeading);
		selectSubject.selectByVisibleText("Customer service");
		
		Select selectOrderRef = new Select(selectOrderReference);
		selectOrderRef.selectByValue("268015");
		
		Select selectProduct = new Select(product);
		selectProduct.selectByValue("6");
		
		messageTxt.sendKeys("Want to return the product");
		sendBtn.click();
	  }
    }
