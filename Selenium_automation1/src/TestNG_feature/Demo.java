package TestNG_feature;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Demo {

	WebDriver driver;
	@BeforeMethod
	public void Setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace\\Selenium_automation1\\Resource\\chromedriver.exe");
	 driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
	}
	
	@Test
	
public void C() {
		
		String Title1=driver.getTitle();
		
		System.out.println(Title1);
		
	}
	
	@Test
	
public void B() {
		
		boolean Logo1=driver.findElement(By.xpath("//img[@alt=\"company-branding\"]")).isDisplayed();
		
		System.out.println(Logo1);
		
	}	
		@AfterMethod
		
		public void Down() throws InterruptedException {
			Thread.sleep(5000);
			driver.quit();
			
		}
		
		
	}
	
	
	
	
	

