package Popups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowPopuporFileUploadpopup {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace\\Selenium_automation1\\Resource\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/upload");
		driver.findElement(By.xpath("//input[@id=\"file-upload\"]")).sendKeys("D:\\velocity notes/11March_Data.xlsx");
		
		driver.findElement(By.id("file-submit")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//h3[text()='File Uploaded!']")).isDisplayed();
	//	driver.findElement(By.xpath(""))

	}

}
