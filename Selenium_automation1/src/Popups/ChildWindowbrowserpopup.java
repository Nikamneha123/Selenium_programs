package Popups;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildWindowbrowserpopup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace\\Selenium_automation1\\Resource\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Windows.html");
		
		driver.findElement(By.xpath("//a[text()='Open New Seperate Windows']")).click();
		
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//button[text()='click']")).click();
		
		String Parentwindow=driver.getWindowHandle();
		
		System.out.println(Parentwindow);
		//C6E852C9FAED738EB9817F5632CDD1C4
		
		Set<String>Childwindows=driver.getWindowHandles();
		
		for(String Childwindow:Childwindows) {
			//Object obj:varname
			//System.out.println(Childwindow);
		if(!Parentwindow.equalsIgnoreCase(Childwindow)) {
			
			driver.switchTo().window(Childwindow);
			
			String Text1=driver.findElement(By.xpath("//h1[contains(text(),'Selenium automates browsers.')]")).getText();
			
			System.out.println(Text1);
			
			driver.close();
				
		}
				
		}
		
		driver.switchTo().window(Parentwindow);
		String Text2=driver.findElement(By.xpath("//h1[text()='Automation Demo Site ']")).getText();
		
		System.out.println(Text2);
		
		driver.quit(); 
		

	}

}
