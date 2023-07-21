package Popups;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Permissionpopup {
	
	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions option=new ChromeOptions();
		
		option.addArguments("-------disable-notifications");
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\eclipse-workspace\\Selenium_automation1\\Resource\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver(option);
		
		driver.manage().window().maximize();
		
		driver.get("https://www.hdfc.com/");
		
		Thread.sleep(2000);
		
		driver.quit();
		
		
		
		
		
	}

}
