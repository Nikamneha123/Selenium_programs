package WebElementMethods;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class makemytrip {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace\\Selenium_automation1\\Resource\\chromedriver.exe");
	
	//create object
	
	WebDriver driver=new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	driver.get("https://www.makemytrip.com/");
	Thread.sleep(4000);
	
	driver.findElement(By.xpath("//span[text()=\"From\"]")).click();
	
	driver.findElement(By.xpath("//input[@placeholder=\"From\"]")).sendKeys("Pune");
	
	Thread.sleep(4000);
	
	List<WebElement> CityFrom= driver.findElements(By.id("//ul[@role=\"listbox\"]"));
	
	Thread.sleep(4000);
	
	System.out.println("total count------>" + CityFrom.size());
	
	for(int i=0;i<CityFrom.size();i++) {
		
		String Citynames=CityFrom.get(i).getText();
		System.out.println(Citynames);
		
		if(CityFrom.get(i).getText().equals("Shirdi,india")) {
			
			System.out.println(CityFrom.get(i).getText());
			CityFrom.get(i).click();
			break;
			

		}
		/*driver.findElement(By.id("dest")).sendKeys("mumbai");
		
		List<WebElement> destCity=driver.findElements(By.xpath("//li[@class=\"sub-city\"]"));
		
		Thread.sleep(4000);
		
		System.out.println("total count------>" + destCity.size());
		
		for(int j=0;j<destCity.size();j++) {
			
			String destCitynames=City.get(i).getText();
			System.out.println(destCitynames);
			
			if(destCity.get(i).getText().equals("sion")) {
				
				System.out.println(destCity.get(i).getText());
				destCity.get(i).click();
				break; */
				
				
			}
			
		
		
	}
	

	

}




