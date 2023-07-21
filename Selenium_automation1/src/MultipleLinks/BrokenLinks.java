package MultipleLinks;

import java.io.IOException;
import java.net.URL;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

	public static void main(String[] args) throws IOException {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace\\Selenium_automation1\\Resource\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.facebook.com/");
		 
		List<WebElement>Links= driver.findElements(By.tagName("a"));
		System.out.println("Number of linkd=======>"+Links.size());
		
		int Brokenlinks=0;
		
		for(WebElement element:Links) {
			String url=element.getAttribute("href");
			if(url==null || url.isEmpty()) {
				
				System.out.println("url is empty or null");
				
			}
			URL Link=new URL(url);
			
			HttpsURLConnection httpscode=(HttpsURLConnection) Link.openConnection();
			
			httpscode.connect();
			
			//200=========ok
			//201=======created
			//400===========bad request
			
			if(httpscode.getResponseCode()>=400) {
				
				System.out.println(httpscode.getResponseCode()+"==>"+url+"is=========>broken list");
				
				Brokenlinks++;
			}
			else {
				System.out.println(httpscode.getResponseCode()+"========>"+url+"is=======>valid list");
				
			}
		}
		
		System.out.println("number of broken list======>"+Brokenlinks);
		
		
		driver.quit();

	}

}
