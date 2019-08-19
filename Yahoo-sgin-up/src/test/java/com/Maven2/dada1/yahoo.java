package com.Maven2.dada1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class yahoo {
	
	
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "/Users/aloksaha/Downloads/chromedriver");
	
	WebDriver driver =new ChromeDriver();
			driver.get("https://login.yahoo.com/account/create?specId=yidReg");

			WebElement ak=driver.findElement(By.xpath("//*[@id='usernamereg-firstName']"));
			 ak.sendKeys("alok");
			 
			 WebElement ap=driver.findElement(By.xpath("//*[@id=\'usernamereg-lastName\']"));
			 ap.sendKeys("saha");

			 WebElement a1=driver.findElement(By.xpath("//*[@id='usernamereg-yid']"));
			 a1.sendKeys("alok_saha");
			 
			 WebElement a2=driver.findElement(By.xpath("//*[@id='usernamereg-phone']"));
			 a2.sendKeys("3479882203");
			 
			 WebElement a3=driver.findElement(By.xpath("//*[@id=\'usernamereg-month\']"));
			 a3.sendKeys("March");

			 WebElement a4=driver.findElement(By.xpath("//*[@id=\"usernamereg-day\"]"));
			 a4.sendKeys("01");
			 
			 WebElement a5=driver.findElement(By.xpath("//*[@id=\"usernamereg-year\"]"));
			 a5.sendKeys("2003");
			 
			 WebElement a6=driver.findElement(By.xpath("//*[@id=\'usernamereg-freeformGender\']"));
			 a6.sendKeys("Male");
			 
			 WebElement a7=driver.findElement(By.xpath("//*[@id=\'reg-submit-button\']"));
			 a7.sendKeys("Click");
						
						
	}
		
}
