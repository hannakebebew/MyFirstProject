package TestNGExcer;

import org.openqa.selenium.WebDriver;

import Maven.SeleniumProject.WebDrivers;

public class PallarealNG2 {
	
	WebDriver driver;
	
	public void createFB () throws InterruptedException {
		
		driver = WebDrivers.FireFox();
		
		driver.manage().window().maximize();
		driver.get("http://www.facebook.com");
		Thread.sleep(5000);
		driver.quit();
		
	}
	

}
