 package Cucumber_pg;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features= "Cucumber_pg",
		glue= {"Cucumber_pg"},
		plugin= {"pretty" , "html:html_ouput"}, strict=false
		
		
		)

public class Runner {

}
