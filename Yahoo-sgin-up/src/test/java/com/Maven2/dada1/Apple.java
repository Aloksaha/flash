package com.Maven2.dada1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Apple {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/aloksaha/Downloads/chromedriver");
		WebDriver ak=new ChromeDriver();
		ak.get("https://accounts.google.com/signup/v2/webcreateaccount?flowName=GlifWebSignIn&flowEntry=SignUp");
		
		WebElement a=ak.findElement(By.xpath("//*[@id=\'firstName\']"));
		a.sendKeys("ALOK");
		
		WebElement a1=ak.findElement(By.xpath("//*[@id=\'lastName\']"));
		a1.sendKeys("SAHA");
		
		WebElement a2=ak.findElement(By.xpath("//*[@id=\'username\']"));
		a2.sendKeys("sahaalok");
		
		WebElement a3=ak.findElement(By.xpath("//*[@id=\'passwd\']/div[1]/div/div[1]/input"));
		a3.sendKeys("abcd1234");
		WebElement a4=ak.findElement(By.xpath("//*[@id=\'confirm-passwd\']/div[1]/div/div[1]/input"));
		a4.sendKeys("abcd1234");
		
	}

}
