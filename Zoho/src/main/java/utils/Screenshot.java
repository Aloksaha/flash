package utils;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Screenshot {
	
	public static void takePicture(WebDriver driver) throws IOException {

		TakesScreenshot shot=(TakesScreenshot)driver;
		File screen=shot.getScreenshotAs(OutputType.FILE);
		Date d = new Date();
		//screenshoot_time_date.png
		String filename = "screenshot/screenshot"+d.toString()+".png";
		File target=new File(filename);
		FileUtils.copyFile(screen, target);
	
		
		
		
		
		
	}

}
