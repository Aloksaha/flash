package com.Maven2.dada1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Subway {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/aloksaha/Downloads/chromedriver");
		WebDriver ak=new ChromeDriver();
		ak.get("http://www.bestbuy.com/identity/newAccount?token=tid%3A5d8211fc-19ae-11e9-a12a-005056aede89");
	
	WebElement a=ak.findElement(By.xpath("//*[@id='fld-firstName']"));
	a.sendKeys("ALOK");
	
	WebElement a1=ak.findElement(By.xpath("//*[@id=\'fld-lastName\']"));
	a1.sendKeys("SAHA");
	
	WebElement a3=ak.findElement(By.xpath("//*[@id=\'fld-e\']"));
	a3.sendKeys("aloksaha2565@gmail.com");
	
	WebElement a4=ak.findElement(By.xpath("//*[@id=\'fld-p1\']"));
	a4.sendKeys("abcd1234");
	
	WebElement a5=ak.findElement(By.xpath("//*[@id=\'fld-p2\']"));
	a5.sendKeys("abcd1234");
	
	WebElement a6=ak.findElement(By.xpath("//*[@id=\'fld-phone\']"));
	a6.sendKeys("3479882203");
	
	
	
	}

}
