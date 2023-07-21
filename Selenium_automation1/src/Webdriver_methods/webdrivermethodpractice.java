package Webdriver_methods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
public class webdrivermethodpractice {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\admin\\\\eclipse-workspace\\\\Selenium_automation1\\\\Resource\\\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		//WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		//driver.navigate().to("https://www.redbus.in/");
	//	driver.navigate().back();
		//driver.navigate().forward();
	//	driver.navigate().refresh();
		
		//String Title=driver.getTitle();
	//	System.out.println(Title);
		
		//String URL=driver.getCurrentUrl();
		
	//	System.out.println(URL);
		//Dimension D=new Dimension(300,400);
	//	driver.manage().window().setSize(D);
		
	//	driver.manage().window().getSize();
		//System.out.println(driver.manage().window().getSize());
		//Point P1=new Point(400,500);
		//driver.manage().window().setPosition(P1);
		
		System.out.println(driver.manage().window().getPosition());
		
		
		driver.close();
		//driver.quit();
		
	}

}
