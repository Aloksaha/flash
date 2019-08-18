package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import model.PageModel;


public class ZohoHome extends PageModel{

	public ZohoHome(WebDriver x) {
		super(x);
		
	}
	public void setlogin() throws InterruptedException {
		WebElement a=getlogin();
		a.click();
	}
	

}

