package Synchronisation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace\\Selenium_automation1\\Resource\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.redbus.in/");
		
		//WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
	//	WebElement Element=wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("src")));
		By input1=By.id("src");
		Waitforelement(driver,input1,30).sendKeys("Pune");
		By input2=By.id("dest");
		
		Waitforelement(driver,input2,10).sendKeys("mumbai");
		
		

	}

	private static WebElement Waitforelement(WebDriver driver, By Locator, int timeout) {
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.presenceOfElementLocated(Locator));
		return driver.findElement(Locator);
	}

}
