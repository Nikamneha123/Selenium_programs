package WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.*;
public class ListBox {
	

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace\\Selenium_automation1\\Resource\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[contains(text(),\"Create new account\")]")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name=\"firstname\"]")).sendKeys("neha");
		
		driver.findElement(By.xpath("//input[@name=\"lastname\"]")).sendKeys("nikam");
		
		driver.findElement(By.xpath("//input[@name=\"reg_email__\"]")).sendKeys("9921786358");
		
		driver.findElement(By.xpath("//input[@name=\"reg_passwd__\"]")).sendKeys("copy");
		
		WebElement  Day=driver.findElement(By.id("day"));
		WebElement  month=driver.findElement(By.id("month"));
		WebElement  Year=driver.findElement(By.id("year"));
		
		Select Select1=new Select(Day); 
		
		//selectByVisibleText(String text)
		
		Select1.selectByVisibleText("5");
		
		
        Select Select2=new Select(month);
		
		//selectByVisibleText(String text)
		
		Select2.selectByVisibleText("May");
		
		
        Select Select3=new Select(Year);
		
		//selectByVisibleText(String text)
		
		Select3.selectByVisibleText("2022");
		
		
		
	
	
	}

}
