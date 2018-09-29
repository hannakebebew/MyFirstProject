package TestNGExcer;

import org.openqa.selenium.WebDriver;

import Maven.SeleniumProject.WebDrivers;

public class PallarealNG1 {
	
	WebDriver driver;
	
	public void createYahooAccount ()  {
		
		driver = WebDrivers.FireFox();
		
		driver.manage().window().maximize();
		driver.get("http://www.yahoo.com");
		
		driver.close();
	}

}
