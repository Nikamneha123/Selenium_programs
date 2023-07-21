package JavascriptExecutor;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Byjus_assignment1 {
	
	WebDriver driver;
	
	@BeforeMethod
	
public void Setup() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace\\Selenium_automation1\\Resource\\chromedriver.exe");
		 driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://byjus.com/");
}
	@Test
	public void Byjus() throws InterruptedException {
		
		//driver.switchTo().frame("container");
		//("//div[@class='bj-form']"))
		
		
		//driver.findElement(By.xpath("//label[normalize-space()='Offline']")).click();
		
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys("Rajveer");
		
		driver.findElement(By.xpath("//input[@name='mobile']")).sendKeys("9921786358");
		
		driver.findElement(By.xpath("//button[normalize-space()='Send OTP']")).click();
		
		Thread.sleep(15000);
		
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("nikamneha1@gmail.com");
		
WebElement State=driver.findElement(By.xpath("//select[@name='state']"));
		
		Select S1=new Select(State);
		
		S1.selectByVisibleText("Maharashtra");
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//button[@id='ftcOfflineScheduleClass']")).click();
		
		
		
	//	driver.findElement(By.xpath("//select[@name='grade']")).
WebElement b1=driver.findElement(By.xpath("//select[@name='grade']"));
		
		Select S2=new Select(b1);
		
		S2.selectByVisibleText("Class 10");
		
		Thread.sleep(2000);
		
		//select[@name='grade']
		
		driver.findElement(By.xpath("//button[@id='ftcOfflineScheduleClass']")).click();
		
		Thread.sleep(5000);
		
		//driver.switchTo().alert();
		
		
		
WebElement S=driver.findElement(By.xpath("//select[@name='state-offline']"));
		
		Select S0=new Select(S);
		
		S0.selectByVisibleText("Maharashtra");
		
WebElement S01=driver.findElement(By.xpath("//select[@name='class-offline']"));
		
		Select S11=new Select(S01);
		
		S11.selectByVisibleText("Class 10");
		
		
WebElement City=driver.findElement(By.xpath("//select[@name='city-offline']"));
		
		Select S3=new Select(City);
		
		S3.selectByVisibleText("Thane");
		
WebElement Center=driver.findElement(By.xpath("//select[@name='center-offline']"));
		
		Select S4=new Select(Center);
		
		S4.selectByVisibleText("None of the Above");
		
		Thread.sleep(5000);
		
		
				
		
	}
	@AfterMethod
	
	public void Teardown() {
		
		driver.quit();
	}
}