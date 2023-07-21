package Action_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouseover {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace\\Selenium_automation1\\Resource\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		WebElement Account= driver.findElement(By.xpath("//span[text()=\"Account & Lists\"]"));
		Actions act=new Actions(driver);
		
		act.moveToElement(Account).build().perform();
		
		driver.findElement(By.xpath("//span[text()=\"Sign in\"]")).click();
		driver.findElement(By.id("ap_email")).sendKeys("nikamneha1@gmail.com");
		
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.id("ap_password")).sendKeys("raj");
		driver.findElement(By.id("signInSubmit")).click();
		
		Thread.sleep(4000);
		
		boolean text=driver.findElement(By.xpath("//span[@class=\"a-list-item\"]")).isDisplayed();
		System.out.println(text);
	}

}
