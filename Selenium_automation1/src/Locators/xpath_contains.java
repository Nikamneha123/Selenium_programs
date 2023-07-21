package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath_contains {
	
public static void main(String[] args) {
		
		System.setProperty("webdriver.crome.driver","C:\\\\Users\\\\admin\\\\eclipse-workspace\\\\Selenium_automation1\\\\Resource\\\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
	//	driver.get("https://www.facebook.com/");
		//driver.findElement(By.xpath("//input[contains(@id,\"login-userna\")]")).sendKeys("nikamneha");
         // driver.findElement(By.xpath("//strong[contains(text(),'in')]"));
		//driver.findElement(By.xpath("//button[contains(text(),'Log in')]")).click();
		
	//	driver.get("https://www.jio.com/selfcare/recharge/mobility/");
		driver.get("https://byjus.com/");
		
		driver.findElement(By.xpath("//label[normalize-space()='Offline']")).click();
		
	//	driver.findElement(By.xpath("//a[contains(text(),'Recharge')]")).click();

}
}