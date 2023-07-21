package Webdriver_methods;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class maximize {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace\\Selenium_automation1\\Resource\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		Thread.sleep(5000);
		
		driver.manage().window().maximize();
		
		driver.get("https://www.youtube.com/");
		
		driver.close();
		
		
	}
}
