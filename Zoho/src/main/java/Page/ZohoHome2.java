package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import model.PageModel2;

public class ZohoHome2 extends PageModel2 {

	public ZohoHome2(WebDriver x) {
		super(x);
		
	}
	
	public void setre() throws InterruptedException {
	
		WebElement a=getrefresh();
		Thread.sleep(4000);
		a.click();
	}

	public void setcrm() {
		WebElement b=getcrm();
		b.click();
	}

		public void setleads() {
			WebElement c=getleads();
			c.click();
		}
		public void setnew() {
			WebElement d=getnew();
//			Select as=new Select(d);
//			as.selectByVisibleText(x);
			d.click();
			
		}
		public void setne() {
			WebElement e=getne();
			e.click();
		}
}
