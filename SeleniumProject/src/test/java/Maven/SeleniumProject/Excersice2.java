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
		
		WebDriver chrome = driver.chromeDriver();
		
		try {
			chrome.navigate().to("http://www.google.com");
			chrome.manage().window().maximize();
			chrome.manage().deleteAllCookies();
		
			chrome.navigate().back();
			Thread.sleep(2000);
			chrome.navigate().forward();
			chrome.navigate().refresh();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		
	
		
	}
	@AfterTest
	public void close() {
		driver.chromeDriver().close(); 
	}
	
	

}
