package testcases;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
import base.BaseClass;
import pages.HomePage;
import pages.LoginPage;
import utilities.ExcelReader;

public class LoginTest extends BaseClass {
	
	@Test(dataProvider = "Credentials")
	public void login(String userName, String password) {
		
		appLogs.info("verify login test started");
		test.log(LogStatus.INFO, "verify login test started");
		
		homePage = new HomePage(driver);
		test.log(LogStatus.INFO, "clicked sign in button");
		homePage.signInBtnClick();
		
		loginPage = new LoginPage(driver);
		test.log(LogStatus.INFO, "entered username and password");
		loginPage.doLogin(userName,password);
		
		String actual = driver.getTitle();
		String expected = "My account - My Store";
		Assert.assertEquals(actual, expected);
		
		test.log(LogStatus.INFO, "verify login test completed");
		appLogs.info("verify login test completed");
	}
	
	@DataProvider(name = "Credentials")
	public Object[][] getData() throws IOException, FileNotFoundException{
		
		excelReader = new ExcelReader("C:\\Users\\Harshit\\eclipse-workspace\\MyStoreAutomationQA\\src\\test\\resources\\excelfiles\\testdata.xlsx");
		int rowNum = excelReader.getRowCount(0);
		int colNum = excelReader.getcellCount(0);
		
		Object[][] data = new Object[rowNum][colNum];
		
		for(int i = 0; i < rowNum; i++) {
			for(int j = 0; j < colNum; j++) {
				data[i][j] = excelReader.getData(0, i, j);
			}
		}
		return data;
		
	}
	
	
}
