package WebElementMethods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBox6 {
	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace\\Selenium_automation1\\Resource\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://www.facebook.com/");
			
			driver.manage().window().maximize();
			
	        driver.findElement(By.xpath("//a[contains(text(),\"Create new account\")]")).click();
			
			Thread.sleep(5000);
			
			driver.findElement(By.xpath("//input[@name=\"firstname\"]")).sendKeys("neha");
			
			driver.findElement(By.xpath("//input[@name=\"lastname\"]")).sendKeys("nikam");
			
			driver.findElement(By.xpath("//input[@name=\"reg_email__\"]")).sendKeys("9921786358");
			
			driver.findElement(By.xpath("//input[@name=\"reg_passwd__\"]")).sendKeys("copy");
			
			Thread.sleep(3000);
			
			String  day="//select[@id=\"day\"]/option";
			String  Month="//select[@id=\"month\"]/option";
			String  Year="//select[@id=\"year\"]/option";
			
			String DOB="1/Jan/2000";
			
			String[] Date=DOB.split("/");
			
			
			Selectdropdown(day,Date[0]);
			Selectdropdown(Month,Date[1]);
			Selectdropdown(Year,Date[2]);
			
			
																													
															
		 // ListBox(day,"1");
			//	ListBox(Month,"Jan");
		//	ListBox(Year,"2000");
																
																
			
			
		}

		private static void Selectdropdown(String element, String values) {
			
	List<WebElement> V1=driver.findElements(By.xpath(element));
	
	System.out.println(V1);
	
	System.out.println(V1.size());
	
	for(int i=0;i<V1.size();i++) {
		System.out.println(V1.get(i).getText());
		if(V1.get(i).getText().equals(values)) {
			
			V1.get(i).click();
		}
	}
	
		
	}

		
}
