package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import base.BasePage;

public class LoginPage extends BasePage {
	
	public LoginPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(id="email")
	public WebElement txtEmailId;

	@FindBy(id="passwd")
	public WebElement txtPassword;
	
	@FindBy(id="SubmitLogin")
	public WebElement submitBtn;
	
	public void doLogin(String email, String passwd) {
		txtEmailId.sendKeys(email);
		txtPassword.sendKeys(passwd);
		submitBtn.click();
	}
}
