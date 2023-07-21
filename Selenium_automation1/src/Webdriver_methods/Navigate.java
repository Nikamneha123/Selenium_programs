package Webdriver_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate {
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace\\Selenium_automation1\\Resource\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		Thread.sleep(5000);
		//driver.get("https://www.amazon.in/gp/help/customer/display.html?nodeId=200507590&ref_=nav_cs_help");
		
		driver.manage().window().maximize();
		driver.navigate().to("https://www.amazon.in/gp/help/customer/display.html?nodeId=200507590&ref_=nav_cs_help");
		
		String Title1=driver.getTitle();
		System.out.println(Title1);
		
		driver.navigate().back();
		Thread.sleep(4000);
		
		driver.navigate().forward();
		Thread.sleep(4000);
		
		driver.navigate().refresh();
		Thread.sleep(4000);
		
	}

	
}
