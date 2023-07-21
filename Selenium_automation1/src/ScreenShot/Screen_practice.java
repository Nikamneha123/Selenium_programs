package ScreenShot;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;
public class Screen_practice {
	
public static void main(String[] args) throws IOException {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace\\Selenium_automation1\\Resource\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://www.redbus.in/");
	
	File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
	String random=RandomString.make(3);
	
	String img="red";
	
	File destination=new File("C:\\Users\\admin\\eclipse-workspace\\Selenium_automation1\\SCREENSHOT_FILE"+random+" " +img+ ".jpg");
	
	FileHandler.copy(source,destination);
	
	
	
}
	
	
	
}
