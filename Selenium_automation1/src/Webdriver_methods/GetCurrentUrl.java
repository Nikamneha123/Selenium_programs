package Webdriver_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCurrentUrl {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace\\Selenium_automation1\\Resource\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		String URL=driver.getCurrentUrl();
		System.out.println(URL);
		
		
		if(URL.equals("https://www.facebook.com/")) {
			System.out.println("correct URL");
		}
		
		else {
			System.out.println("incorrect URL");
		}
	}
}
