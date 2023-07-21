package Popups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fifth_popups {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace\\Selenium_automation1\\Resource\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hdfcbank.com/");
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.id("login1")).sendKeys("nikamneha");
	//	driver.findElement(By.id("password")).sendKeys("raj");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		String exp_msg="Please enter your password";
		Alert al=driver.switchTo().alert();
		
		String AL_msg=al.getText();
		if(exp_msg.equals(AL_msg))
			System.out.println("correct msg");
		else
			System.out.println("incorrect msg");
		Thread.sleep(3000);
		al.accept();
		Thread.sleep(3000);
	}
	
	
	
}




