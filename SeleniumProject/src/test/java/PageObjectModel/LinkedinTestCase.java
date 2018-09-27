package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Maven.SeleniumProject.WebDrivers;

public class LinkedinTestCase {
	
	WebDriver driver;
	
	@Test 
	
	public void linkDin () {
		
		driver = WebDrivers.FireFox();
		driver.manage().window().maximize();
		driver.get("https://www.linkedin.com/uas/login");
		
		LinkedinElements obj = new LinkedinElements (driver); 
		
		obj.LinkAccess("Hanna", "Sara");
		
		
	}


}
