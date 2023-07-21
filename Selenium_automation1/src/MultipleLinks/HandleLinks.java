package MultipleLinks;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleLinks {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace\\Selenium_automation1\\Resource\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.facebook.com/");
		 
		List<WebElement>Links= driver.findElements(By.tagName("a"));
		System.out.println("Number of linkd=======>"+Links.size());
		
		for(WebElement link:Links) {
			System.out.println(link.getText());
			System.out.println(link.getAttribute("href"));
		}
           driver.quit();
	}

}
