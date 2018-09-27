package Maven.SeleniumProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDrivers {

	public static WebDriver chromeDriver() {
		
		System.setProperty("webdriver.chrome.driver", "/Users/hannakebebew/Desktop/SelaniumDrivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		return driver;
		
	} 
	
	public static WebDriver FireFox() {
		
		System.setProperty("webdriver.gecko.driver", "/Users/hannakebebew/Desktop/SelaniumDrivers/geckodriver");
		WebDriver driver = new FirefoxDriver ();
		return driver; 
	}


	

	
	
}
