package Webdriver_methods;

//import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.WebDriver;


public class GetSize {
	
public static void main(String[] args) throws InterruptedException {
	

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace\\Selenium_automation1\\Resource\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.orangehrm.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		//Dimension d1=new Dimension(200,100);
		//Dimension d1=driver.manage().window().getSize();
		System.out.println(driver.manage().window().getSize());
		
		driver.close();
	
	}
	
	
	
	
	
	
	
	
}
	
	
	
	
	
	

