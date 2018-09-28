package PageObjectModel;

import org.openqa.selenium.WebDriver;

import Maven.SeleniumProject.WebDrivers;

public class Factory2 {
	
	static WebDriver driver;
	
	public static void openBrowser (String browser, String url) {
		
		if (browser.equalsIgnoreCase("firefox"))
			driver =  WebDrivers.FireFox(); 
		
		else {
			if (browser.equalsIgnoreCase("chrome")) {
				driver =  WebDrivers.chromeDriver();
			}
			
			driver.manage().window().maximize();
			driver.get("https://www.linkedin.com/uas/login");
		}
	}

}
