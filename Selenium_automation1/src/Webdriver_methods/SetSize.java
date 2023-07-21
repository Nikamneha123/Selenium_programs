package Webdriver_methods;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetSize {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace\\Selenium_automation1\\Resource\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		
		Dimension D1=new Dimension(800,900);
		
		driver.manage().window().setSize(D1);
		
		Thread.sleep(5000);
		System.out.println(driver.manage().window().getSize());
		//driver.get("https://www.facebook.com/");
		//driver.findElement(By.xpath("//input[@id=\"_61uy_55r1_1kbt_9nyh\"]")).sendKeys("nikamneha1@gmail.com");
		
		driver.close();
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
