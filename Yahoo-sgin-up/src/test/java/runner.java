import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

 
	@RunWith(Cucumber.class)
	@CucumberOptions(
			
			features= "Cucumber",
			glue= {"Cucumber"},
			plugin= {"pretty" , "html:html_ouput"},strict=false
					
					
)
			 public class runner {

			

			
			


}
