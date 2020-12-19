package utilities;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import base.BaseClass;

public class Utilities extends BaseClass {
	
	public static String screenshotPath;
	public static String screenshotName;
	
	public static void captureScreenshot() throws IOException {
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,300)");
		
		File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		
		Date date = new Date();
		screenshotName = date.toString().replaceAll(":", "_").replaceAll(" ","_") + ".png";
		
		FileUtils.copyFile(srcFile, new File(System.getProperty("user.dir") + "\\target\\reports\\html\\" + screenshotName));
	}
}
