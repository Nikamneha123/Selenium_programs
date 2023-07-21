package Action_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Doubleclick {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace\\Selenium_automation1\\Resource\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
	WebElement Double=	driver.findElement(By.xpath("//button[text()=\"Double-Click Me To See Alert\"]"));
		Actions act=new Actions(driver);
		
		act.doubleClick(Double).build().perform();
		
		Thread.sleep(3000);
		
		driver.switchTo().alert().accept();
		driver.quit();

	}

}
