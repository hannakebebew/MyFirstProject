package PageObjectModel;

import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Maven.SeleniumProject.WebDrivers;

public class LinkedinTestCase {
	
	WebDriver driver;
	
	@Test
	
	
	public void signInLink () {
	
	try {
		driver = WebDrivers.FireFox();
		
		LinkedinElements login = new LinkedinElements (driver);
		
		driver.manage().window().maximize();
		
		
		driver.get("https://www.linkedin.com/uas/login");
		
		
		login.LinkedinLogin("Hannak@gmail.com", "Sara");
		Thread.sleep(5000);
		
		driver.close();
	} catch (Exception e) {
		
		e.printStackTrace();
	}
		
	}

}
