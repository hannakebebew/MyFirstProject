package Maven.SeleniumProject;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class CRA {
	
	WebDriver driver;
	
	@Test(groups="a")
	public void craAccounts () throws InterruptedException {
			
		try {
			driver = WebDrivers.FireFox();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.get("http://www.cra-arc.gc.ca/");
			
			
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			driver.findElement(By.linkText("English")).click();
			
			
			driver.findElement(By.xpath("/html/body/main/div[1]/section[2]/div/aside/div[1]/ul/li[1]/a")).click();
			
			
			driver.findElement(By.partialLinkText("Sign-In Partner Login")).click();
			
			
			Actions action = new Actions(driver);
			WebDriverWait wait = new WebDriverWait(driver, 20);
			
			
			//wait.until(ExpectedConditions.urlToBe("https://services.securekeyconcierge.com/cbs/nav/home-accueil-eng"));
			
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			

			WebElement tdbankImage = driver.findElement(By.xpath("/html/body/div[4]/div/div/div[1]/div[1]/div[2]/div[2]/div/ul/li[12]/a"));
			
			action.moveToElement(tdbankImage);
			
			
			
		
			
			wait.until(ExpectedConditions.elementToBeClickable(tdbankImage));
			
			tdbankImage.click();
			
			
			
			
			
			
			
			
			
			
			//Username Textfield
			driver.findElement(By.id("username100")).sendKeys("kldjlksdf");
			
			
			driver.findElement(By.cssSelector("input#password")).sendKeys("crs1Unity");
			
			//clicking submit button
			driver.findElement(By.tagName("button"));
			
			
			
			
			driver.close();
		} catch (NoSuchElementException e) {
		
			e.printStackTrace();
		}
		

		
		
	}
	
	
	
	

}
