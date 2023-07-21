package Webdriver_methods;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Quit {
	public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace\\Selenium_automation1\\Resource\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	//driver.get("https://www.youtube.com/");

	driver.manage().window().maximize();
	
	Thread.sleep(5000);
	//driver.findElement((() By.xpath(("//a[contains(text(),'OrangeHRM,Inc')]"))).click();
	//driver.findElement(By.xpath("//a[contains(text(),'youtube,Inc')]")).click();
	driver.get("https://www.facebook.com/");
	driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("abcccccc");
	//driver.findElement(By.xpath("//input[@class=\"inputtext _55r1 _6luy\"]").sendKeys("mohini@gmail.com");
	//driver.get("https://www.orangehrm.com/");
	
//	driver.findElement(By.xpath("//input[@placeholde=\"enter your email address here\"]")).sendKeys("abcccccc");
	Thread.sleep(5000);
	//driver.quit();
	}
	
	
	
	
	
	

}
