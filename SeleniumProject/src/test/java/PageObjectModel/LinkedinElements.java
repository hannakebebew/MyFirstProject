package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LinkedinElements {
	
	WebDriver driver; 
	
	public void LinkedinLogin (String name, String pass) {
		driver.findElement(By.id("session_key-login")).sendKeys(name);
		driver.findElement(By.id("session_password-login")).sendKeys(pass);
		driver.findElement(By.id("btn-primary")).click();
		
	}
	
}
