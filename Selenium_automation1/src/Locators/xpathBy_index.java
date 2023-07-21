package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathBy_index {
	
public static void main(String[] args) {
		
		System.setProperty("webdriver.crome.driver","C:\\\\Users\\\\admin\\\\eclipse-workspace\\\\Selenium_automation1\\\\Resource\\\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/electronics/b/?ie=UTF8&node=976419031&ref_=nav_cs_electronics");
		//driver.findElement(By.xpath("(//a[@class=\"nav-a  \"]) [8]")).click();
		
	//	driver.get("https://www.redbus.in/");
	//	driver.findElement(By.xpath("(//span[@class=\"name_rb_vertical\"])[1]")).click();
		
		driver.findElement(By.xpath("//a[@class=\"nav-a  \"][8]")).click();
		
        driver.close();
}
}