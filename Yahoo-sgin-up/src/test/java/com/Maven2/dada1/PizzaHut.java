package com.Maven2.dada1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PizzaHut {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/aloksaha/Downloads/chromedriver");
		WebDriver ak=new ChromeDriver();
		ak.get("https://www.ae.com/myaccount/create-account");

		WebElement a1=ak.findElement(By.xpath("//*[@id='ember613']"));
		a1.sendKeys("SAHA");
		
	}

}
