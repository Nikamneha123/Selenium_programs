package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tagname {
	public static void main(String[] args) {
		
System.setProperty("webdriver.crome.driver","C:\\\\Users\\\\admin\\\\eclipse-workspace\\\\Selenium_automation1\\\\Resource\\\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/login/");
		
		driver.findElement(By.xpath("//input[contains(@id,\"email\")]")).sendKeys("NIKAMNEHA1@GMAIL.COM");
		//driver.findElement(By.xpath("//input[@name=\"pass\"]")).sendKeys("abcdefgh");
		
		driver.findElement(By.xpath("//input[contains(@id,'pass')]")).sendKeys("abbbbbb");
		driver.findElement(By.linkText("Sign up for Facebook")).click();
	
		
		
		
	}

}
