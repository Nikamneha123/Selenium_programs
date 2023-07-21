package Action_class;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardActions {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace\\Selenium_automation1\\Resource\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(120,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login/");
		
		WebElement input=driver.findElement(By.id("email"));
		WebElement input1=driver.findElement(By.id("pass"));
		
		
		
		Thread.sleep(2000);
		
		input.sendKeys("nehapadghan");
		
		Actions act=new Actions(driver);
		
		//control a
		act.keyDown(Keys.CONTROL);
		act.sendKeys("a");
		act.keyUp(Keys.CONTROL);
		act.build().perform();
		
		
		//control c
		
		act.keyDown(Keys.CONTROL);
		act.sendKeys("c");
		act.keyUp(Keys.CONTROL);
		act.build().perform();
		
		
		act.sendKeys(Keys.TAB);
		
		act.build().perform();
		
		
		//control v
		act.keyDown(Keys.CONTROL);
		act.sendKeys("v");
		act.keyUp(Keys.CONTROL);
		act.build().perform();
		
		//compare text
		
		if(input.getAttribute("value").equals(input1.getAttribute("value"))) {
			
			System.out.println("correct output");
			
		}
			else {
				System.out.println("incorrect");
			
		}

	}

}
