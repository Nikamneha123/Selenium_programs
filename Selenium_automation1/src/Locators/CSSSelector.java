package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSSelector {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace\\Selenium_automation1\\Resource\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.facebook.com/login/");
			
			driver.manage().window().maximize();
			
			//contains by attribute
			//syntax
			//tagname[contains(@atrributename,'attribuut value)];
		//	driver.findElement(By.cssSelector("#email")).sendKeys("nikam");
		//	driver.findElement(By.cssSelector("pass")).sendKeys("rajveer");
		//	driver.findElement(By.cssSelector("input#email")).sendKeys("aaaaa");
		//	driver.findElement(By.cssSelector("input#pass")).sendKeys("qwer");
			//driver.findElement(By.cssSelector("input.inputtext[name=\"email\"]")).sendKeys("mock");
		//	driver.findElement(By.cssSelector("input.inputtext[name=\"pass\"]")).sendKeys("mock");
			driver.findElement(By.cssSelector("input.inputtext._55r1.inputtext._1kbt.inputtext._1kbt")).sendKeys("mock");
			
			//driver.findElement(By.cssSelector("input.inputtext._55r1.inputtext._9npi.inputtext._9npi")).sendKeys("mock");
		//	driver.findElement(By.cssSelector("input.inputtext.55r1.inputtext.1kbt.inputtext._1kbt")).sendKeys("mannnn");
			
			//driver.findElement(By.cssSelector("input.inputtext._55r1._6luy")).sendKeys("nikamneha");
			
			//driver.findElement(By.cssSelector("input.inputtext._55r1._6luy._9npi")).sendKeys("avbbbb");
		}

	
	
	
	
	
	

}
