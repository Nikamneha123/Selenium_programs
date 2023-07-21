package Automation_Sel;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Launch {
	
	public static void main(String[] args)  {
		
		
		System.setProperty("Webdriver.gecko.driver", "C:\\Users\\admin\\eclipse-workspace\\Selenium_automation1\\Resource\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
      driver.get("https://www.facebook.com/login/");
      
 // Thread.sleep(5000);
  driver.close();
      
		
		
		
	}

}
