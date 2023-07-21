package IFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframe_pract {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace\\Selenium_automation1\\Resource\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
        driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		
		driver.manage().window().maximize();
		
		driver.switchTo().frame("iframeResult");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[@onclick=\"document.getElementById('demo').innerHTML = Date()\"]")).click();
		
		driver.switchTo().defaultContent();
		driver.findElement(By.id("tryhome")).click();
		
		driver.quit();
		
		
		
		
		
		
		
		
	}
}
