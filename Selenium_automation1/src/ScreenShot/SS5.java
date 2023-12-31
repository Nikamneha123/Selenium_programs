package ScreenShot;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.grid.Main;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class SS5 {
	
	static WebDriver driver;
	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\eclipse-workspace\\Selenium_automation1\\Resource\\chromedriver.exe");
		
	    driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com");
		
		String File="Facebook";
		SS5.Takescreenshot(File);
	//	SS5.Takescreenshot("Test"+File);
	//	SS5.Takescreenshot("Test1"+File);
		
		Thread.sleep(4000);
		driver.quit();
		
	}
		
	public static void Takescreenshot(String Filename) throws IOException {
		
	
		File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		String Random=RandomString.make(7);
		
		File Dest=new File("C:\\\\Users\\\\admin\\\\eclipse-workspace\\\\Selenium_automation1\\\\SCREENSHOT_FILE\\"+Filename+" "+Random+".jpg");
		
		FileHandler.copy(source, Dest);
		
		
		
		

		
	}


	
	
	

}
