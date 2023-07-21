package Webdriver_methods;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetPosition {
	
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace\\Selenium_automation1\\Resource\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		Thread.sleep(5000);
		
		driver.manage().window().maximize();
		
		driver.get("https://www.youtube.com/");
		
		Point P1=new Point(800,900);
		
		driver.manage().window().setPosition(P1);
		
		Thread.sleep(5000);
		System.out.println(driver.manage().window().getPosition());
		
		driver.close();
		
	
	
	
}

}
