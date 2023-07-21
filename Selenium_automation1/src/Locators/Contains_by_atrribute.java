package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Contains_by_atrribute {
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace\\Selenium_automation1\\Resource\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		
		driver.manage().window().maximize();
		
		//contains by attribute
		//syntax
		//tagname[contains(@atrributename,'attribuut value)];
		driver.findElement(By.xpath(""));
		
	}

}
