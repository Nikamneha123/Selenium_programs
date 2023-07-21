package WebElementMethods;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic_redbus {

public static void main(String[] args) throws InterruptedException {
		
		//handle listbox without select class
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace\\Selenium_automation1\\Resource\\chromedriver.exe");
		
		//create object
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	//	driver.manage().window().wait(20,10);
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.get("https://www.redbus.in/");
		Thread.sleep(2000);
		
		driver.findElement(By.id("src")).sendKeys("pune");
		Thread.sleep(3000);
		List<WebElement> city = driver.findElements(By.xpath("//ul[@class=\"sc-dnqmqq eFEVtU\"]//li"));
		Thread.sleep(4000);
		//to print total size in dropdown
		System.out.println(city.size());
		// to print all values from dropdown
		String option="Indapur";
		for(int i = 0; i< city.size(); i++) {
			String citynames= city.get(i).getText();
			System.out.println(citynames);
			Thread.sleep(2000);
			
			//to select the specific value from dropdown
			if(city.get(i).getText().equals("Indapur")) {
		         System.out.println( city.get(i).getText());
		         city.get(i).click();
			}
			
			if(city.get(i).getText().contains(option)) {
				city.get(i).click();
			}
		}
		
        driver.findElement(By.id("dest")).sendKeys("mumbai");
        List<WebElement> destcity = driver.findElements(By.xpath("//li[@class=\"sc-iwsKbI jTMXri cursorPointing\"]"));
        Thread.sleep(4000);
        System.out.println(destcity.size());
        
        //to print all city values
        for(int j =0; j< destcity.size(); j++) {
           String destcitynames=  destcity.get(j).getText();
           System.out.println(destcitynames);
           
           //to select specific values
           
           if(destcity.get(j).getText().equals("Sion")) {
        	   System.out.println(destcity.get(j).getText());
        	   destcity.get(j).click();
           }
        }
		
		
		
		
		Thread.sleep(4000);
		driver.close();
	}
}
