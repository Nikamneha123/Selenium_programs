package Synchronisation;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import javax.lang.model.element.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class FluentWait1 {

	public static void main(String[] args) {

System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace\\Selenium_automation1\\Resource\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
	//	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		String url="https://www.facebook.com/";
		driver.get(url);
		
		//Fluent wait
		//waiting for 20 second for an element to be present on the pagechecking for its present once every 5 sec
		
		Wait<WebDriver>MyWait=new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(20))
				.pollingEvery(Duration.ofSeconds(4)).ignoring(NoSuchElementException.class);
		
		WebElement element=MyWait.until(new Function<WebDriver,WebElement>(){
			public WebElement apply(WebDriver driver) {
				
				
				return driver.findElement(By.id("email12"));
			}
			
			
			
		});
		
		
		element.sendKeys("neha");
		
		
		
		
		
		
		

	}

}
