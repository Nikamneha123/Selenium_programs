package IFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe4 {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace\\Selenium_automation1\\Resource\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_iframe_height_width");
		
		driver.manage().window().maximize();
		
		driver.switchTo().frame("iframeResult");
		
		Thread.sleep(3000);
		
		driver.switchTo().frame(0);
		String Text=driver.findElement(By.xpath("//h1[text()='This page is displayed in an iframe']")).getText();
		
		
		System.out.println(Text);
		
		driver.switchTo().parentFrame();
		
		String Text1=driver.findElement(By.xpath("//p[text()='You can use the height and width attributes to specify the size of the iframe:']")).getText();
	
		System.out.println(Text1);
		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("//a[@onclick='openMenu()']")).click();
		
		System.out.println("completed");
		
		driver.quit();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	

}
