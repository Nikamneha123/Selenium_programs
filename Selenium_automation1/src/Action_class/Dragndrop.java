package Action_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Dragndrop {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace\\Selenium_automation1\\Resource\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		
		Thread.sleep(2000);
		
	WebElement source=driver.findElement(By.id("box3"));
	WebElement destination=	driver.findElement(By.id("box103"));
		
		Actions act=new Actions(driver);
		
		act.dragAndDrop(source, destination).build().perform();
		
		
		Thread.sleep(3000);
		driver.quit();
		
		
	}

}
