package com.Maven2.dada1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dunkin {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/aloksaha/Downloads/chromedriver");
		WebDriver ak=new ChromeDriver();
		ak.get("http://www.dunkindonuts.com/en/dd-perks/registration");
		
		WebElement a=ak.findElement(By.xpath("//*[@id=\'email\']"));
		a.sendKeys("sahaalok1234@gmail.com");
		WebElement a1=ak.findElement(By.xpath("//*[@id=\"firstName\"]"));
		a1.sendKeys("ALOK");
		WebElement a2=ak.findElement(By.xpath("//*[@id=\"lastName\"]"));
		a2.sendKeys("SAHA");
		WebElement a3=ak.findElement(By.xpath("//*[@id=\"password\"]"));
		a3.sendKeys("as1234");
		WebElement a4=ak.findElement(By.xpath("//*[@id=\"confirmPassword\"]"));
		a4.sendKeys("as1234");
		WebElement a5=ak.findElement(By.xpath("//*[@id=\"profileZipCode\"]"));
		a5.sendKeys("11210");
		WebElement a6=ak.findElement(By.xpath("//*[@id=\"promo\"]"));
		a6.sendKeys("327653");
		

	}

}
