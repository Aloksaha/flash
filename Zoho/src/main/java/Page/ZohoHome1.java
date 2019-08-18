package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import model.PageModel1;

public class ZohoHome1 extends PageModel1 {

	public ZohoHome1(WebDriver x) {
		super(x);
		// TODO Auto-generated constructor stub
	}
	public void setemail(String x) {
		WebElement b=getemail();
		b.sendKeys(x);
	}
	public void setpass(String x1) {
		WebElement c=getpass();
		c.sendKeys(x1);
	}
	public void setsingin() {
		WebElement d=signin();
		d.click();
	}
}
