package WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sendkey_click {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace\\Selenium_automation1\\Resource\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://www.facebook.com/");
			
			
			//sendkeys
			
			driver.findElement(By.id("email")).sendKeys("neha1");
			driver.findElement(By.id("pass")).sendKeys("%^$#fghj");
			Thread.sleep(2000);
			
			//click
			
			driver.findElement(By.xpath("//button[@name=\"login\"]")).click();
			
			Thread.sleep(2000);
			
			
			
			

	
	}

}
