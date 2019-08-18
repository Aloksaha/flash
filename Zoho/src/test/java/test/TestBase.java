package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class TestBase {
	 WebDriver driver;
		@BeforeSuite
		public void m() {
			System.setProperty("webdriver.chrome.driver", "/Users/aloksaha/Downloads/chromedriver");
			driver=new ChromeDriver();
			driver.get("https://www.zoho.com");
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		}
		
		@AfterSuite
		public void n() {
			//driver.close();
		}


}
