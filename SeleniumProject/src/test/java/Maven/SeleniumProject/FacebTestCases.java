package Maven.SeleniumProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class FacebTestCases {
	
	WebDriver driver;
	
	@Test
	
	public void CredentialVerification () {
		
		
		driver = WebDrivers.fireFox();
		driver.manage().window().maximize();
		//driver.manage().deleteAllCookies();
		driver.get("https://en-gb.facebook.com/login/");
		
		
		FacebkMethods login = new FacebkMethods (driver);
		FacebkMethods login1 = PageFactory.initElements(driver, Maven.SeleniumProject.FacebkMethods.class);
		
		login1.usernameTextField.sendKeys("Hello");
		
		
		login.accessFB("hanna", "1234l;");
		
		driver.close();
		
	}

	
	
	

}
