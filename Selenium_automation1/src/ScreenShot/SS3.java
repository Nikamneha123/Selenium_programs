package ScreenShot;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class SS3 {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException, IOException {
System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\eclipse-workspace\\Selenium_automation1\\Resource\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.redbus.in/");
		Thread.sleep(3000);
		File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		String Random=RandomString.make(7);
		String IMGName="redbus";
		File Dest=new File("C:\\Users\\admin\\eclipse-workspace\\Selenium_automation1\\SCREENSHOT_FILE\\"+IMGName+" "+Random+".jpg");
		
		FileHandler.copy(source, Dest);
		
		driver.quit();
		

	}

}
