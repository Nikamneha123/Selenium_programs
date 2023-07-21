package JavascriptExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollDown_upTillBottom {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace\\Selenium_automation1\\Resource\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/");
		
		JavascriptExecutor JS=(JavascriptExecutor)driver;
		
		
		//scrolldown
		
		//JS.executeScript("window.scrollBy(0,document.body.scrollHeight)", "");
		
		JS.executeScript("window.scrollBy(0,document.body.scrollHeight)","");
		Thread.sleep(3000);
		
		//scrollup
		
		JS.executeScript("document.documentElement.scrollTop=0", "");
		
		
		
		
		
	}

}
