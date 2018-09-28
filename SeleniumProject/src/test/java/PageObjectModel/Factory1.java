package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Factory1 {
	
	WebDriver driver;
	
	public Factory1(WebDriver driver) {
		super();
		this.driver = driver;
	}

	@FindBy (how=How.ID, using= "session_key-login") 
	WebElement username;
	
	@FindBy (how=How.ID, using ="session_password-login")
	WebElement password;
	
	@FindBy(how=How.ID, using = "btn-primary") 
	WebElement login;
	
	public void logLinkedin (String name, String pass) {
		username.sendKeys(name);
		password.sendKeys(pass);
		login.click();
	}

}
