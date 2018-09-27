package Maven.SeleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class FacebkMethods {
	
	WebDriver driver; 
	

	By username = By.name("email");
	By password = By.name("pass");
	By login = By.xpath("//*[@id=\"u_0_2\"]");
	
	@FindBy(how = How.XPATH, using= "")
	public WebElement usernameTextField;
		
	
	
	
	
	public FacebkMethods(WebDriver driver) {
		
		this.driver = driver;
	
	}
	
	public void accessFB (String email, String pw) {
		
		driver.findElement(username).sendKeys(email);
		driver.findElement(password).sendKeys(pw);
		driver.findElement(login).click();
	}
	
	
}
