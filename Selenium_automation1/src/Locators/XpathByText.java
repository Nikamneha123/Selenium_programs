package Locators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByText {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.crome.driver","C:\\\\Users\\\\admin\\\\eclipse-workspace\\\\Selenium_automation1\\\\Resource\\\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		//driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("nikamneha1@gmail.com");
		//driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("NEHA123");
		
		//driver.findElement(By.xpath("//a[text()=\'Forgotten account?\']")).click();
		
		//driver.findElement(By.xpath("//a[text()='Forgotten password?']")).click();	
		//driver.findElement(By.xpath("//a[starts-with(text(),'F')]")).click();
		//driver.findElement(By.xpath("//a[contains(text(),'?')]")).click();
		driver.findElement(By.xpath("//a[text()='Create a Page']")).click();
		
		
		
	}
	

}
