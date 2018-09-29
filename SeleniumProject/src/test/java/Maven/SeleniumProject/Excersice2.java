package Maven.SeleniumProject;

import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Excersice2 {
	
	WebDrivers driver; 
	
	@ Test
	
	public void invokeBrowser () {
		
		WebDriver chrome = WebDrivers.FireFox(); 
		
		try {
			chrome.navigate().to("https://www.linkedin.com/uas/login?_l=en");
			chrome.manage().window().maximize();
			chrome.manage().deleteAllCookies();
		
			chrome.close();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		
	
	}
	

}
