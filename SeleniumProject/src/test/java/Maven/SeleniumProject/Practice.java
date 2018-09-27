package Maven.SeleniumProject;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Practice {

	WebDrivers driver = new WebDrivers();
	WebDriver chrome = driver.chromeDriver();
	WebDriver firefox = driver.FireFox();

	@Test
	public void test() {

		chrome.get("http://www.amazon.com");
		chrome.manage().window().maximize();
		firefox.get("HTTP://yahoo.com");
	}

	@AfterTest
	public void closeTest() {
		chrome.close();
		firefox.close();

	}
}