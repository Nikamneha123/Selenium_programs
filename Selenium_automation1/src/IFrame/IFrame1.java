package IFrame;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class IFrame1 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace\\Selenium_automation1\\Resource\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		
		driver.manage().window().maximize();
		
		driver.switchTo().frame("iframeResult");
		
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//button[@type=\"button\"]")).click();
		
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//a[@id=\"tryhome\"]")).click();
		
		
		
		
		
		
	}
	
	
	
	
	
	
}
