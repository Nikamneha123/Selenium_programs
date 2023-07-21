package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByContains {
	
public static void main(String[] args) {
		
		System.setProperty("webdriver.crome.driver","C:\\\\Users\\\\admin\\\\eclipse-workspace\\\\Selenium_automation1\\\\Resource\\\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//driver.get("https://www.mahagenco.in/");
		//driver.findElement(By.xpath("//a[text()='Projects']")).click();
		
		driver.get("https://www.facebook.com/");
		
		//driver.findElement(By.xpath("//a[contains(text(),'up')]")).click();
		//driver.findElement(By.xpath("//a[@role=\"button\"]")).click();
		//driver.findElement(By.xpath("//button[contains(text(),'Log in')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'a Page')]")).click();

}
}