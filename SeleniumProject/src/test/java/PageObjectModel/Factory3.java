package PageObjectModel;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Factory3 {
	

@Test

public void linkedIn () {
	
WebDriver driver = Factory2.openBrowser("FireFox", "https://www.linkedin.com/uas/login?_l=en");
Factory1 loginlink = PageFactory.initElements(driver, Factory1.class);
loginlink.logLinkedin("Hanna@yahoo.com", "Sara");

}

}
