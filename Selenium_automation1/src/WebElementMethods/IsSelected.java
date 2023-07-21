package WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelected {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace\\Selenium_automation1\\Resource\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[contains(text(),\"Create new account\")]")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@type=\"radio\"]")).click();
		
		Boolean B1=driver.findElement(By.xpath("//input[@type=\"radio\"]")).isSelected();
		System.out.println(B1);
		
		
	}
	
	
	
	
	

}
