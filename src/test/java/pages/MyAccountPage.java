package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import base.BasePage;

public class MyAccountPage extends BasePage  {
	
	public MyAccountPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//header/div[2]/div[1]/div[1]/nav[1]/div[1]/a[1]")
	public WebElement gotoMyAccountPage;

	@FindBy(xpath = "//span[contains(text(),'My addresses')]")
	public WebElement myAddressLink;
	
	@FindBy(xpath = "//body/div[@id='page']/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[9]/a[1]/span[1]")
	public WebElement updateBtnClick;
	
	@FindBy(id="address1")
	public WebElement addressTxt1;
	
	@FindBy(id="address2")
	public WebElement addressTxt2;
	
	@FindBy(id="city")
	public WebElement cityTxt;
	
	@FindBy(id="id_state")
	public WebElement stateTxt;
	 
	@FindBy(id="postcode")
	public WebElement postalCode;
	
	@FindBy(id="submitAddress")
	public WebElement submitAddress;
	
	public void changeAddress(JavascriptExecutor js, String address1, String address2, String city, String postCode) {
		
		gotoMyAccountPage.click();
		myAddressLink.click();
		js.executeScript("window.scrollBy(0,500)");
		updateBtnClick.click();
		js.executeScript("window.scrollBy(0,500)");
		
		addressTxt1.clear();
		addressTxt1.sendKeys(address1);

		addressTxt2.clear();
		addressTxt2.sendKeys(address2);

		cityTxt.clear();
		cityTxt.sendKeys(city);

		Select select = new Select(stateTxt);
		select.selectByVisibleText("New York");
		
		postalCode.clear();
		postalCode.sendKeys(postCode);
		
		submitAddress.click();
	}

}
