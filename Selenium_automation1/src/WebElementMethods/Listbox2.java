package WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.*;


public class Listbox2 {
	
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
		
		WebElement  day=driver.findElement(By.id("day"));
		WebElement  Month=driver.findElement(By.id("month"));
		WebElement  Year=driver.findElement(By.id("year"));
		
		String DOB="1/Jan/2000";
		
		String[] Date=DOB.split("/");
		
		
		ListBox(day,Date[0]);
		ListBox(Month,Date[1]);
		ListBox(Year,Date[2]);
		
		
																														
														
	 // ListBox(day,"1");
		//	ListBox(Month,"Jan");
	//	ListBox(Year,"2000");
															
															
		
		
	}

	private static void ListBox(WebElement element, String Text) {
		Select Select1=new Select(element);
		Select1.selectByVisibleText(Text);
		
		
		
	}
	
	

}
