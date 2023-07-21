package ExceptionHandling;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaleElementException {
	//stale means-----elements not fresh or not new that time this element i stale element
public static void main(String[] args) {
	
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace\\Selenium_automation1\\Resource\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
	//	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
	
	WebElement link=driver.findElement(By.xpath("//a[text()='Mobiles']"));
	
	link.click();
	
	driver.navigate().back();
	
	//driver.get(driver.getCurrentUrl());
	
	//WebElement link1=driver.findElement(By.xpath("//a[text()='Mobiles']"));
	//link1.click();
	try {
		link.click();
		
	}catch(StaleElementReferenceException SE) {
		
		WebElement link1=driver.findElement(By.xpath("//a[text()='Mobiles']"));
		
		link1.click();
		
	}
	
	
	
	
	
	driver.quit();
	
	
	
	
	
	
	
}
}
