package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.BasePage;

public class ProductPage extends BasePage {

	public ProductPage(WebDriver driver) {
		super(driver);
	}
	@FindBy(xpath = "//a[contains(text(),'Write a review')]")
	public WebElement writeReviewTxt;
	
	@FindBy(id="comment_title")
	public WebElement addReviewTitle;
	
	@FindBy(id="content")
	public WebElement addReviewContent;
	
	@FindBy(id="submitNewMessage")
	public WebElement submitReviewBtn;
	
	@FindBy(xpath = "//span[contains(text(),'OK')]")
	public WebElement OkBtn;
	
	public void writeReview(String title, String content) {
		writeReviewTxt.click();
		addReviewTitle.sendKeys(title);
		addReviewContent.sendKeys(content);
		submitReviewBtn.click();
		OkBtn.click();
	}
}
