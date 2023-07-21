package ScreenShot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Zerodha {

	public static void main(String[] args) throws IOException, InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\eclipse-workspace\\Selenium_automation1\\Resource\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://kite.zerodha.com/");
	
	//take screnshot n copy object
	
	File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
	File destination=new File("C:\\Users\\admin\\eclipse-workspace\\Selenium_automation1\\SCREENSHOT_FILE/Z1.jpg");
	
	FileHandler.copy(source, destination);
	
	Thread.sleep(2000);
	
       driver.quit();
	}

}
