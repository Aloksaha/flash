package com.Maven2.dada1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Ali {
	@BeforeClass
	@Test
	public void maina() {
		
		
		System.setProperty("webdriver.chrome.driver", "/Users/aloksaha/Downloads/chromedriver");
		WebDriver ak=new ChromeDriver();
		ak.get("https://login.aliexpress.com/join/buyer/expressJoin.htm");
		
		
		
		
		WebElement a=ak.findElement(By.xpath("//*[@id='email-ipt']"));
		a.sendKeys("aloksaha2565@gmail.com");
		
		
		WebElement a1=ak.findElement(By.xpath("//*[@id='first-name-ipt']"));
		a1.sendKeys("ALOK");
		
		
		WebElement a2=ak.findElement(By.xpath("//*[@id='last-name-ipt']"));
		a2.sendKeys("SAHA");
		
		
		WebElement a3=ak.findElement(By.xpath("//*[@id='password-ipt']"));
		a3.sendKeys("abcd123");
		
		
		WebElement a4=ak.findElement(By.xpath("//*[@id='confirm-password-ipt']"));
		a4.sendKeys("abcd123");
		
		
		WebElement a5=ak.findElement(By.xpath("//*[@id='checkcode-ipt']"));
		a5.sendKeys("jkbkf");

	}

}
