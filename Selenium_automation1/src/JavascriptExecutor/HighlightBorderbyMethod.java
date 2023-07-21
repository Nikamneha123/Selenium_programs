package JavascriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HighlightBorderbyMethod {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace\\Selenium_automation1\\Resource\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		WebElement name1=driver.findElement(By.xpath("//img[@class=\"fb_logo _8ilh img\"]"));
		
		WebElement name2=driver.findElement(By.id("email"));
		
		WebElement name3=driver.findElement(By.id("pass"));
		
		HighlightBorderbyMethod.drawborder1(driver,name1);
		HighlightBorderbyMethod.drawborder1(driver,name2);
		HighlightBorderbyMethod.drawborder1(driver,name3);
	
	}



	private static void drawborder1(WebDriver driver, WebElement element) {
		
		JavascriptExecutor JS=(JavascriptExecutor)driver;
		JS.executeScript("arguments[0].style.border='15px solid red'",element);
		JS.executeScript("arguments[0].style.background='yellow'",element);
		
		
	}
	

}
