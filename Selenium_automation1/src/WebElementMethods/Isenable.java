package WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Isenable {
	public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace\\Selenium_automation1\\Resource\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.facebook.com/");
	
	driver.manage().window().maximize();
	
	Boolean B1=driver.findElement(By.xpath("//button[text()=\"Log in\"]")).isEnabled();
	Boolean B2=driver.findElement(By.xpath("//input[@name=\"pass\"]")).isEnabled();
	System.out.println(B1);
	System.out.println(B2);
	
	
	
	}
	

}
