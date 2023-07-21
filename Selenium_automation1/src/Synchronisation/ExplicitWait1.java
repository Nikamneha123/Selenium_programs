package Synchronisation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait1 {

	public static void main(String[] args) {
		
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace\\Selenium_automation1\\Resource\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			
			driver.get("https://www.redbus.in/");
			
			WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));//timeout
			
			WebElement Element=wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("src")));
			
			Element.sendKeys("Pune");
			
			WebDriverWait mywait=new WebDriverWait(driver,Duration.ofSeconds(15));
			
			WebElement Element1=mywait.until(ExpectedConditions.visibilityOfElementLocated(By.id("dest")));
			
			Element1.sendKeys("mumbai");
			
			
			
			


	}

}
