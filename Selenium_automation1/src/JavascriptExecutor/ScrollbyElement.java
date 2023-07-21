package JavascriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollbyElement {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace\\Selenium_automation1\\Resource\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/");
		
		JavascriptExecutor JS=(JavascriptExecutor)driver;
		WebElement name=driver.findElement(By.xpath("//h1[text()='W3Schools Spaces']"));
		
		//scrollbyelement
		
		JS.executeScript("arguments[0].scrollIntoView();",name);
		
	}

}
