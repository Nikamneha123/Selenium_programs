package Popups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fourth_popups {
	public static void main(String[] args) throws InterruptedException {
		
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace\\Selenium_automation1\\Resource\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://the-internet.herokuapp.com/javascript_alerts");
	
	driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
	Thread.sleep(3000);
	Alert text=driver.switchTo().alert();
	System.out.println(text.getText());
	Thread.sleep(2000);
	text.sendKeys("welcome");
	//text.getText();
	
	Thread.sleep(3000);
	text.accept();
	Thread.sleep(3000);
	driver.quit();
	
}
}