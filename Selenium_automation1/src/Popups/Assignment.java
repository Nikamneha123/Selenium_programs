package Popups;

import java.util.List;
import java.util.Set;
import java.util.ArrayList;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment {
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace\\Selenium_automation1\\Resource\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.w3schools.com/tags/tryit.asp?filename=tryhtml_link_target");
		Thread.sleep(3000);
        String Parentwindow=driver.getWindowHandle();
		
		System.out.println(Parentwindow);
		
		driver.switchTo().frame("iframeResult");
		driver.findElement(By.xpath("//a[contains(text(),\"Visit W3Schools.com!\")]")).click();
		Thread.sleep(3000);
		
		Set<String>childwindow=driver.getWindowHandles();
		System.out.println("childwindow"+childwindow);
		//parent+child
		
		List<String> window=new ArrayList(childwindow);
		
		String parent=window.get(0);
		String child=window.get(1);
		
		System.out.println(parent);
		System.out.println(child);
		
		driver.switchTo().window(child);
		Boolean logo=driver.findElement(By.xpath("//i[@class=\"fa fa-logo ws-hover-text-green\"]")).isDisplayed();	
		System.out.println(logo); //true
		
		driver.switchTo().window(Parentwindow);
		System.out.println("parentwindow===========>"+driver.getTitle());
		
		
		driver.switchTo().window(child);
		System.out.println("childwindow"+driver.getTitle());
		
		driver.switchTo().window(Parentwindow);
		//System.out.println("parentwindow==========>"+Parentwindow.ge);
		
		// String Parentwindow2=driver.getWindowHandle();
			
			System.out.println(Parentwindow);
			
			Thread.sleep(3000);
			
			driver.switchTo().defaultContent();
			
			String run=driver.findElement(By.id("runbtn")).getText();
		
			System.out.println(run);
			driver.close();
			
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
