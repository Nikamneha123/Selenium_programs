package WebElementMethods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListBox5 {

	public static void main(String[] args) throws InterruptedException {
		
		//handle listbox without select class
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace\\Selenium_automation1\\Resource\\chromedriver.exe");
		
		//create object
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.redbus.in/");
		
		driver.findElement(By.id("src")).sendKeys("Wakad,pune");
		driver.findElement(By.id("dest")).sendKeys("mumbai");
		
		List<WebElement> City=driver.findElements(By.xpath("//ul[@class=\"autoFill homeSearch\"]//li"));
		
		Thread.sleep(4000);
		
		System.out.println("total count------>" + City.size());
		
		for(int i=0;i<City.size();i++) {
			
			String Citynames=City.get(i).getText();
			System.out.println(Citynames);
			
			if(City.get(i).getText().equals("Wakad")) {
				
				System.out.println(City.get(i).getText());
				City.get(i).click();
				

			}
			
			
			List<WebElement> destCity=driver.findElements(By.xpath("//ul[@class=\"autoFill homeSearch\"]//li"));
			
			Thread.sleep(4000);
			
			System.out.println("total count------>" + destCity.size());
			
			for(int j=0;j<destCity.size();j++) {
				
				String destCitynames=City.get(i).getText();
				System.out.println(destCitynames);
				
				if(destCity.get(i).getText().equals("vashi")) {
					
					System.out.println(destCity.get(i).getText());
					destCity.get(i).click();
					
					
				}
				
			
			
		}
		
		
		

	}

	}
}
