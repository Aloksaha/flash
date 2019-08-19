import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class login {
WebDriver driver;
	
	@Given("^I want to go facebook page\\.$")
	public void i_want_to_go_facebook_page()  {
	    
		System.setProperty("webdriver.chrome.driver", "/Users/aloksaha/Downloads/chromedriver");
		 driver=new ChromeDriver();
		driver.get("http://www.facebook.com");
		
	}

	@When("^i entered username$")
	public void i_entered_username() throws Throwable {
		System.out.println("user");	
	}
	

	@When("^password$")
	public void password() {
	}

	@Then("^i will in homepge\\.$")
	public void i_will_in_homepge() {
	}

	

}
