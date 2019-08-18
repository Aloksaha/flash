package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import model.PageModel4;

public class ZohoHome4 extends PageModel4{

	public ZohoHome4(WebDriver x) {
		super(x);
		
	}
	public void setre1() throws InterruptedException {
		
		WebElement d=getrefresh1();
		Thread.sleep(4000);
		d.click();
	}
	public void setcrm2() {
		WebElement c=getcrm1();
		c.click();
	}
	public void setnew() {
		WebElement a=getnew();
		a.click();
	}
	public void setcontact() {
		WebElement b=getcontact();
		b.click();
	}

}
