package ScreenShot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot1 {

	public static void main(String[] args) throws IOException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\eclipse-workspace\\Selenium_automation1\\Resource\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://www.facebook.com/login/");
	
	//take screnshot n copy object
	
	File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
	File destination=new File("C:\\Users\\admin\\Desktop\\Screenshot/demo.jpg");
	
	FileHandler.copy(source, destination);
	
	
       driver.quit();
	}

}
