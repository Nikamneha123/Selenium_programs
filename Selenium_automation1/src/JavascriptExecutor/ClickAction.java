  package JavascriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickAction {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace\\Selenium_automation1\\Resource\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		JavascriptExecutor JS=(JavascriptExecutor)driver;
		
		WebElement Username=driver.findElement(By.id("email"));
		
		WebElement Password=driver.findElement(By.id("pass"));
		//scrollbyelement
		
		JS.executeScript("arguments[0].value='"+"Neha"+"'",Username);
		JS.executeScript("arguments[0].value='"+"Neha123"+"'",Password);
		
		WebElement Loginbutton=driver.findElement(By.xpath("//button[text()='Log in']"));
		
		JS.executeScript("arguments[0].click()", Loginbutton);
		
		
		
		
		
		
		
	}

}
