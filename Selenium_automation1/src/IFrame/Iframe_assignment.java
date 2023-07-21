package IFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe_assignment {

public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace\\Selenium_automation1\\Resource\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demoqa.com/frames");
		
		driver.manage().window().maximize();
		driver.switchTo().frame("frame1");
		
		WebElement text=driver.findElement(By.xpath("//h1[@id=\"sampleHeading\"]"));
        String text1 =text.getText();
        System.out.println(text1);
        Thread.sleep(4000);
        
        driver.switchTo().defaultContent();
        
        driver.findElement(By.xpath("//div[@class=\"header-wrapper\"]")).click();
        
        Thread.sleep(4000);
        driver.close();
		
		
		
		
		
		
	}
	
	
	
	
	
	
}
