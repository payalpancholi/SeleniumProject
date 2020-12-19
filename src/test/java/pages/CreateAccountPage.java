package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import base.BasePage;

public class CreateAccountPage extends BasePage {
	
	public CreateAccountPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(id="id_gender1")
	public WebElement radioBtn1;
	
	public void clickRadioBtn1() {
		radioBtn1.click();
	}
	
	@FindBy(id="id_gender2")
	public WebElement radioBtn2;
	
	public void clickRadioBtn2() {
		radioBtn2.click();
	}
	
	@FindBy(id="customer_firstname")
	public WebElement firstName;
	
	public void enterFirstName() {
		firstName.sendKeys("Hemeel");
	}
	
	@FindBy(id="customer_lastname")
	public WebElement lastName;
	
	public void enterLastName() {
		lastName.sendKeys("pancholi");
	}
	
	@FindBy(id="email")
	public WebElement emailId;
	
	public void getEmailId() {
		emailId.getAttribute("value");
	}
	
	@FindBy(id="passwd")
	public WebElement password;
	
	public void enterPassword() {
		password.sendKeys("password");
	}
	
	@FindBy(id="days")
	public WebElement daysDropDown;
	
	public void selectDay()
	{
		Select sel = new Select(daysDropDown);
		sel.selectByValue("28");
	}
	
	@FindBy(id="months")
	public WebElement monthsDropDown;
	
	public void selectMonth()
	{
		Select sel = new Select(monthsDropDown);
		sel.selectByValue("7");
	}
	
	@FindBy(id="years")
	public WebElement yearsDropDown;
	
	public void selectYear()
	{
		Select sel = new Select(yearsDropDown);
		sel.selectByValue("1990");
	}
	
	@FindBy(id="newsletter")
	public WebElement newsletterChkBox;
	
	public void isChecked1() {
		newsletterChkBox.click();
	}
	
	@FindBy(id="optin")
	public WebElement offersReceiveChkBox;
	
	public void isChecked2() {
		offersReceiveChkBox.click();
	}
	
	// Address Starts here
	
	@FindBy(id="firstname")
	public WebElement firstname;
	
	public void enterFirstname() {
		firstname.sendKeys("Hemeel");
	}
	
	@FindBy(id="lastname")
	public WebElement lastname;
	
	public void enterLastname() {
		lastname.sendKeys("Pancholi");
	}
	
	@FindBy(id="company")
	public WebElement companyName;
	
	public void enterCompanyName() {
		companyName.sendKeys("BusyQA");
	}
	
	@FindBy(id="address1")
	public WebElement address1;
	
	public void enterAddress1() {
		address1.sendKeys("50");
	}
	
	@FindBy(id="address2")
	public WebElement address2;
	
	public void enterAddress2() {
		address2.sendKeys("Gorsebrook Court");
	}
	
	@FindBy(id="city")
	public WebElement city;
	
	public void enterCity() {
		city.sendKeys("Brampton");
	}
	
	@FindBy(id="id_state")
	public WebElement state;
	
	public void selectState() {
		Select sel = new Select(state);
		sel.selectByVisibleText("Maryland");
	}
	
	@FindBy(id="postcode")
	public WebElement postalCode;
	
	public void enterPostalCode() {
		postalCode.sendKeys("12345");
	}
	
	@FindBy(id="id_country")
	public WebElement country;
	
	public void selectCountry() {
		Select sel = new Select(country);
		sel.selectByVisibleText("United States");
	}
	
	@FindBy(id="phone_mobile")
	public WebElement mobileNumber;
	
	public void enterMobileNumber() {
		mobileNumber.sendKeys("1234567890");
	}
	
	@FindBy(id="alias")
	public WebElement addresAlias;
	
	public void getAddressAlias() {
		addresAlias.getAttribute("value");
	}
	
	@FindBy(id="submitAccount")
	public WebElement submitAccountBtn;
	
	public void submitAccount() {
		submitAccountBtn.click();
	}
}
