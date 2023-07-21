package Webdriver_methods;

//import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitle {
	public static void main(String[] args) {
		
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace\\Selenium_automation1\\Resource\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.amazon.in/gp/help/customer/display.html?nodeId=200507590&ref_=nav_cs_help");
			
			String Title=driver.getTitle();
			System.out.println(Title);
			
			driver.close();
			String ExpectedTitle="Help - Amazon Customer Service";
			if(Title.equals(ExpectedTitle)) {
				System.out.println("correct title");
			}
			
			else {
				System.out.println("incorrect title");
			}
			
		}
	}


