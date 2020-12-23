package base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import javax.mail.MessagingException;
import javax.mail.internet.AddressException;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import pages.AddressPage;
import pages.CategoryPage;
import pages.ContactUsPage;
import pages.HomePage;
import pages.LoginPage;
import pages.MyAccountPage;
import pages.OrderSummaryPage;
import pages.PaymentPage;
import pages.ProductPage;
import pages.ShippingPage;
import utilities.ExcelReader;
import utilities.ExtentManager;

public class BaseClass{
	
	public static WebDriver driver = null;
	public static ExcelReader excelReader;
	public Logger appLogs = Logger.getLogger("qaLogger");
	public ExtentReports reports = ExtentManager.getInstance();
	public static ExtentTest test;
	
	
	//Page Classes
	public HomePage homePage;
	public LoginPage loginPage;
	public MyAccountPage myAccountPage;
	public CategoryPage categoryPage;
	public ProductPage productPage;
	public OrderSummaryPage orderSummaryPage;
	public AddressPage addressPage;
	public ShippingPage shippingPage;
	public PaymentPage paymentPage;
	public ContactUsPage contactUsPage;
	
	@BeforeSuite
	public void init() throws IOException {
		
		Properties config = new Properties();
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "\\src\\test\\resources\\config.properties");
		config.load(fis);
		appLogs.debug("loading the config properties file");
		
		if(driver == null) {
			if(config.getProperty("browser").equals("chrome")) {
				System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") +"\\src\\test\\resources\\driverexecutables\\chromedriver.exe");
				driver = new ChromeDriver();
				//test.log(LogStatus.INFO, "chrome browser launched");
				appLogs.debug("chrome browser launched");
			}else if (config.getProperty("browser").equals("firefox")) {
				System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
				driver = new FirefoxDriver();
				appLogs.debug("firefox browser launched");
		   } else if (config.getProperty("browser").equals("edge")) {
				System.setProperty("webdriver.edge.driver", "MicrosoftWebDriver.exe");
				driver = new EdgeDriver();
				appLogs.debug("edge browser launched");
			}
			
			driver.get(config.getProperty("testsiteURL"));
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		}
	}
	
	@AfterSuite
	public void tearDown() throws AddressException,MessagingException,IOException {
		if(driver != null) {
			driver.quit();
		}
	}

}
