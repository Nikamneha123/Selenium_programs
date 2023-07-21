package Locators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByAttribute {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace\\Selenium_automation1\\Resource\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
//	driver.get("https://www.instagram.com/");
		//driver.get("https://www.facebook.com/");
		
		driver.get("https://www.redbus.in/railways");
		//driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("nikamneha1@gmail.com");
		//driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("NEHA123");
		//driver.findElement(By.xpath("//div[@class=\"_li\"]")).click();
		//driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		//driver.findElement(By.xpath("//input[@value=\"2918\"]")).sendKeys("pradeep@gmail.com");
		
		//driver.findElement(By.xpath("//input[@autocorrect=\"off\"]")).sendKeys("998765433");
		//driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("abvcgfd");
		//driver.findElement(By.xpath("//button[@class=\"_acan _acao _acat _aj1-\"]")).click();
	 //  driver.findElement(By.xpath("//div[@class=\"x9f619 xjbqb8w x78zum5 x168nmei x13lgxp2 x5pf9jr xo71vjh x1n2onr6 x1plvlek xryxfnj x1c4vz4f x2lah0s xdt5ytf xqjyukv x1qjc9v5 x1oa3qoh x1nhvcw1\"]")).click();
	   // driver.findElement(By.xpath("//a[contains text(),'fa']")).click();
	    driver.findElement(By.xpath("//id[@class=\"sc-bxivhb hrsLPT\"]")).sendKeys("chandrapur");
	    
	    
		
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
