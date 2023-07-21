package IFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe3 {
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace\\Selenium_automation1\\Resource\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Frames.html");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[text()='Iframe with in an Iframe']")).click();
		
		WebElement Outerframe=driver.findElement(By.xpath("//div[@id=\"Multiple\"]//iframe"));
		
		driver.switchTo().frame(Outerframe);
		
		String text=driver.findElement(By.xpath("//h5[text()=\"Nested iFrames\"]")).getText();
		
		System.out.println(text);
		
WebElement innerframe=driver.findElement(By.xpath("/html/body/section/div/div/iframe"));  ///html/body/section/div/div   ///html/body/section/div
		
		driver.switchTo().frame(innerframe);
		
		driver.findElement(By.xpath("//input[contains(@type,\"text\")]")).sendKeys("hii");
		
		
		//driver.switchTo().parentFrame();
		//System.out.println("outer------" +text);
		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("//a[contains(text(),'WebTable')]")).click();
		
		System.out.println("completed");
		
		driver.quit();
		
		
		
		
		
		
		
		
		
		

}
}