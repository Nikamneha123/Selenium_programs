package JavascriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HighlightBorder {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace\\Selenium_automation1\\Resource\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		JavascriptExecutor JS=(JavascriptExecutor)driver;
		
		WebElement name=driver.findElement(By.id("email"));
		
		WebElement name1=driver.findElement(By.id("pass"));
		//scrollbyelement
		
		JS.executeScript("arguments[0].style.border='15px solid red'",name);
		JS.executeScript("arguments[0].style.border='5px solid yellow'",name1);
		
		
		
		
		
		
	}

}
