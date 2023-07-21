package Popups;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle2 {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace\\Selenium_automation1\\Resource\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://hrm.flourisense.in/web/index.php/auth/login");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[contains(text(),'OrangeHRM, Inc')]")).click();
		
		Set<String>WindowId=driver.getWindowHandles();
		
		Iterator<String>it=WindowId.iterator();
		
		String parentwindow=it.next();
		String childwindow=it.next();
		
		System.out.println("parent window====>"+parentwindow);
		
		System.out.println("child window====>"+childwindow);
		
		
		driver.switchTo().window(parentwindow);
		System.out.println("parentwindow"+driver.getTitle());
		
		
		driver.switchTo().window(childwindow);
		System.out.println("childwindow"+driver.getTitle());
		
		driver.findElement(By.id("Form_submitForm_EmailHomePage")).sendKeys("test123");
		driver.findElement(By.id("Form_submitForm_action_request")).click();
		
		driver.switchTo().window(parentwindow);
		
		driver.findElement(By.xpath("//input[@class=\"oxd-input oxd-input--active\"]")).sendKeys("neha_nikam_padghan");
		
		driver.findElement(By.xpath("//input[@class=\"oxd-input oxd-input--active\"]")).sendKeys("raj");
		
		driver.findElement(By.xpath("//button[@class=\"oxd-button oxd-button--medium oxd-button--main orangehrm-login-button\"]")).click();
		
		driver.quit();
		
		
		
		
		
		
		
	}

}
