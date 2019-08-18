package model;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;

public class PageModel3 extends ModelBase {

	public PageModel3(WebDriver x) {
		super(x);
		
	}
	
	public WebElement get() throws InterruptedException {
		//driver.navigate().refresh();
		Thread.sleep(5000);
		WebElement l=driver.findElement(By.xpath("//span[@class='lyteMarginRight']"));
		return l;
	}
	public WebElement getcompany() {
		FluentWait<WebDriver>wait=new FluentWait<WebDriver>(driver);
		wait.withTimeout(30, TimeUnit.SECONDS).pollingEvery(5, TimeUnit.SECONDS).ignoring(NoSuchElementException.class);
		
		WebElement a=driver.findElement(By.xpath("//input[@id='Crm_Leads_COMPANY']"));
		return a;
	}
	
	public WebElement getfname() {
		WebElement b=driver.findElement(By.xpath("//div[@class='textFld FIRSTNAME tabDivCreate selectBoxSelect2']//input[@type='text']"));
		
		return b;
	}
	public WebElement getlname() {
		WebElement aa=null;
        try {
        	WebElement  c=driver.findElement(By.xpath("//input[@id='Crm_Leads_LASTNAME']"));
		
            
        } catch (org.openqa.selenium.NoSuchElementException | NoSuchElementException ex) {
            System.out.println("Not found");
          
        }
        return aa;
	}
	public WebElement gettitle() {
		WebElement  d=driver.findElement(By.xpath("//input[@id='Crm_Leads_DESIGNATION']"));
		return d;
	}
	public WebElement getemail() {
		WebElement  e=driver.findElement(By.xpath("//input[@id='Crm_Leads_EMAIL']"));
		return e;
	}
	public WebElement getphone() {
		WebElement  f=driver.findElement(By.xpath("//input[@id='Crm_Leads_PHONE']"));
		return f;
	}
	public WebElement getfax() {
		WebElement  g=driver.findElement(By.xpath("//input[@id='Crm_Leads_FAX']"));
		return g;
	}
	public WebElement getmobile() {
		WebElement  h=driver.findElement(By.xpath("//input[@id='Crm_Leads_MOBILE']"));
		return h;
	}
	public WebElement getwebsite() {
		WebElement  i=driver.findElement(By.xpath("//input[@id='Crm_Leads_WEBSITE']"));
		return i;
	}
	public WebElement getsource() throws InterruptedException {
		Thread.sleep(5000);
		
		WebElement j = driver.findElement(By.xpath("//*[@id='Crm_Leads_LEADSOURCE']"));
		return j;
	}
	public WebElement getsource1() throws InterruptedException {
		Thread.sleep(4000);
		WebElement jj = driver.findElement(By.xpath("//input[@type='search']"));
		return jj;
	}
	
	public WebElement getstatus() {
		WebElement  k=driver.findElement(By.xpath("//*[@id=\"Leads_fldRow_STATUS\"]/div[2]"));
		return k;
	}
	public WebElement getstatus1()  {
		WebElement  k1=driver.findElement(By.xpath("//*[@id=\"select2-Crm_Leads_STATUS-result-s2i1-Contact in Future\"]/child::*"));
//		Actions as=new Actions(driver);
//		as.moveToElement(k1);
//		as.click();
//		
//		as.build().perform();
		return k1;
	}
	public WebElement getindustry() {
		
		WebElement  l=driver.findElement(By.xpath("//*[@id='Crm_Leads_INDUSTRY']"));
		
		return l;
	}
	public WebElement getindustry1() {
		WebElement  l1=driver.findElement(By.xpath("//input[@type='search']"));
		return l1;
	}
	public WebElement getemployees() throws InterruptedException {
		//driver.navigate().refresh();
		//Thread.sleep(3000);
		WebElement  m=driver.findElement(By.xpath("//input[@id='Crm_Leads_EMPCT']"));
		return m;
	}
	public WebElement getrevenue()  {
		//
		WebElement  n=driver.findElement(By.xpath("//input[@id='Crm_Leads_ANNUALREVENUE']"));
		return n;
	}
	public WebElement getrating() {
		WebElement  o=driver.findElement(By.xpath("//select[@id='Crm_Leads_RATING']/following-sibling::*"));
		return o;
	}
	public WebElement getrating1() {
		WebElement  o1=driver.findElement(By.xpath("//ul/li[contains(@id,'Active')]"));
		Actions aa=new Actions(driver);
		aa.moveToElement(o1);
		aa.click();
		aa.build().perform();
		return o1;
	}
	public WebElement getclick() throws InterruptedException {
		Thread.sleep(4000);
		WebElement  o=driver.findElement(By.xpath("//input[@id='Crm_Leads_EMAILOPTOUT']"));
		return o;
	}
	public WebElement getskype() {
		WebElement  p=driver.findElement(By.xpath("//input[@id='Crm_Leads_SKYPEIDENTITY']"));
		return p;
	}
	public WebElement gettwitter() {
		WebElement  q=driver.findElement(By.xpath("//input[@id='Crm_Leads_TWITTER']"));
		return q;
	}
	public WebElement getseemail() {
		WebElement  r=driver.findElement(By.xpath("//input[@id='Crm_Leads_ADDN_EMAIL']"));
		return r;
	}
	public WebElement getsave() throws InterruptedException {
		//Thread.sleep(5000);
		WebElement t=driver.findElement(By.xpath("//input[@id='saveLeadsBtn']"));
		return t;
	}
	public WebElement getstreet() {
		WebElement  aa=driver.findElement(By.xpath("//*[@id='Crm_Leads_LANE']"));
		return aa;
	}
	public WebElement getcity() {
		WebElement  ab=driver.findElement(By.xpath("//input[@id='Crm_Leads_CITY']"));
		return ab;
	}
	public WebElement getstate() {
		WebElement  ac=driver.findElement(By.xpath("//input[@id='Crm_Leads_STATE']"));
		return ac;
	}
	public WebElement getzip() {
		WebElement  ad=driver.findElement(By.xpath("//input[@id='Crm_Leads_CODE']"));
		return ad;
	}	
	public WebElement getcountry() {
		WebElement  ae=driver.findElement(By.xpath("//input[@id='Crm_Leads_COUNTRY']"));
		return ae;
	}
	public WebElement getdescription() {
		WebElement  af=driver.findElement(By.xpath("//textarea[@id='Crm_Leads_DESCRIPTION']"));
		return af;
	}
	
}
