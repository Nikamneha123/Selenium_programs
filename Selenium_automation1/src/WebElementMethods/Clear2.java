package WebElementMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Clear2 {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace\\Selenium_automation1\\Resource\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://www.facebook.com/");
			
			driver.manage().window().maximize();
			
			WebElement N=driver.findElement(By.id("email"));
			
			N.sendKeys("234566");
			
			Thread.sleep(2000);
			N.clear();
			Thread.sleep(2000);
			N.sendKeys("NEHA");
			
			WebElement N1=driver.findElement(By.id("pass"));
			N1.sendKeys("maitrey");
			
			Thread.sleep(2000);
			
			N1.clear();
			
			Thread.sleep(2000);
			
			//N1.clear();
			//Thread.sleep(2000);
			
			N1.sendKeys("8769888");
			
			Thread.sleep(2000);
			
			driver.quit();
			
			

}
}
