package JavascriptExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HorizontalRight {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace\\Selenium_automation1\\Resource\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://blog.hubspot.com/website/horizontal-scrolling");
		
		JavascriptExecutor JS=(JavascriptExecutor)driver;
		
		
		//scrolldown
		
		JS.executeScript("window.scrollBy(10000,0)", "");
		
		Thread.sleep(3000);
		
		//scrollup
		
		JS.executeScript("window.scrollBy(-2000,0)", "");
		
		
		
		
		
	}

}
