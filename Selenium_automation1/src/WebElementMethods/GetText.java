package WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetText {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace\\Selenium_automation1\\Resource\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			/*driver.get("https://www.facebook.com/");
			
			driver.manage().window().maximize();
			
            String ExpectedText="Facebook helps you connect and share with the people in your life.";
            String ExpectText="Create a Page";
            
            String Actualtext=driver.findElement(By.xpath("//h2[contains(text(),'Facebook helps you')]")).getText();
            
            if(ExpectedText.equals(Actualtext)) {
            	System.out.println("correct text");
            	
            }
            else {
            	System.out.println("incorrect text");
       
            	
            }
	
	String Text=driver.findElement(By.xpath("//a[contains(text(),'Create a Page')]")).getText();
	if(ExpectText.equals(Text)) {
		
		System.out.println("correct text");
	}
	else {
		System.out.println("incorrect text");
	}
		*/
			
			
			driver.get("https://www.instagram.com/accounts/login/");
			String ExpectedText="Forgot password?";
	
			 String Actualtext=driver.findElement(By.xpath("//a[contains(@tabindex,\"Forgot \")]")).getText();
			 if(ExpectedText.equals(Actualtext)) {
	            	System.out.println("correct text");
	            	
	            }
	            else {
	            	System.out.println("incorrect text");
	       
	            	
	            }
	            
	}
}
