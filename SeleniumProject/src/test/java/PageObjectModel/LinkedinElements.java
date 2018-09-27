package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LinkedinElements {
	
	WebDriver driver;
	
	By username = By.id("session_key-login");
	By password = By.id("session_key-login");
	By login = By.id("btn-primary");
	
	public LinkedinElements(WebDriver driver) {
		super();
		this.driver = driver;}
		
		public void LinkAccess (String user, String pass) {
			
			driver.findElement(username).sendKeys(user, pass);
			driver.findElement(login).click();
			driver.close();
		}
	
	
	
	
}
