package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import model.PageModel8;

public class ZohoHome8 extends PageModel8{

	public ZohoHome8(WebDriver x) {
		super(x);
		
	}
	
	public void sethome() {
		WebElement a=gethome();
		a.click();
	}
	public void setleads() {
		WebElement b=getleads();
		b.click();
	}
	public void setcontacts() {
		WebElement c=getcontacts();
		c.click();
	}
	public void setaccounts() {
		WebElement d=getaccounts();
		d.click();
	}

}
