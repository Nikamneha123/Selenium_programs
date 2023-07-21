package WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayed {
	
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace\\Selenium_automation1\\Resource\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://www.facebook.com/");
			
			driver.manage().window().maximize();
			
			Boolean Input=driver.findElement(By.xpath("//button[@name=\"login\"]")).isDisplayed();
			
			
			System.out.println(Input);
			
			//WebElement Input1=driver.findElement(By.xpath("//h2[text()=\"Facebook helps you connect and share with the people in your life.\"]"));
			//System.out.println(Input1.isDisplayed());
			
		//	WebElement Input3=driver.findElement(By.xpath("//i[@class=\"img sp_EP9wX8qDDvu sx_0de3e6\"]"));
		//	System.out.println(Input3.isDisplayed());
			
	
			
			
			Thread.sleep(5000);
			
			driver.quit();
			
	
	
	
	
	

}
}