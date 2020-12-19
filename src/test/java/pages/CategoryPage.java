package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import base.BasePage;

public class CategoryPage extends BasePage {

	public CategoryPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//header/div[3]/div[1]/div[1]/div[6]/ul[1]/li[2]/a[1]")
	public WebElement dressesMenu;
	
	@FindBy(xpath = "//header/div[3]/div[1]/div[1]/div[6]/ul[1]/li[2]/ul[1]/li[3]/a[1]")
	public WebElement summerDresses;
	
	@FindBy(xpath = "//img[@src='http://automationpractice.com/img/p/1/6/16-home_default.jpg']")
	public WebElement productImg;
	
	@FindBy(xpath = "//a[@data-id-product='6']")
	public WebElement addToCartProduct;
	
	@FindBy(xpath = "//a[@title='Proceed to checkout']")
	public WebElement proceedToCheckOut;
	
	@FindBy(xpath = "//header/div[3]/div[1]/div[1]/div[6]/ul[1]/li[3]/a[1]")
	public WebElement tShirtMenu;
	
	@FindBy(xpath = "//body/div[@id='page']/div[2]/div[1]/div[3]/div[2]/ul[1]/li[1]/div[1]/div[1]/div[1]/a[1]/img[1]")
	public WebElement tShirtImg;
	
	@FindBy(xpath = "//body/div[@id='page']/div[2]/div[1]/div[3]/div[2]/ul[1]/li[1]/div[1]/div[2]/div[2]/a[2]")
	public WebElement moreBtn;
	
	public void selectProductCategory(Actions actions,JavascriptExecutor js) {
		
		actions.moveToElement(dressesMenu).build().perform();
		summerDresses.click();
		js.executeScript("window.scrollBy(0,500)");
		actions.moveToElement(productImg).build().perform();
		addToCartProduct.click();
		proceedToCheckOut.click();
	}
	
	public void clickMoreBtn(Actions actions, JavascriptExecutor js) {
		
		tShirtMenu.click();
		js.executeScript("window.scrollBy(0,700)");
		actions.moveToElement(tShirtImg).build().perform();
		moreBtn.click();
		js.executeScript("window.scrollBy(0,500)");
	}
}
