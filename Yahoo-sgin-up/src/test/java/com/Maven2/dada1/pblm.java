package com.Maven2.dada1;


import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class pblm {

	public static void main(String[] args) throws InterruptedException {
	
	
		System.setProperty("webdriver.chrome.driver", "/Users/aloksaha/Downloads/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.yahoo.com");
		
		
		
		 ((JavascriptExecutor) driver).executeScript("window.open('http://www.facebook.com','_blank');");
		 
		  
		  ((JavascriptExecutor) driver).executeScript("window.open('http://www.google.com','_blank');");
		
		Set<String>window=driver.getWindowHandles();
		
		
		
		
		for(String s:window) {
			Thread.sleep(4000);
			
			String a=driver.switchTo().window(s).getTitle();
		
			
			
		
			if(a.equals("Facebook - Log In or Sign Up")) {
				
				driver.close();
			}
		}
	
	}
	
}