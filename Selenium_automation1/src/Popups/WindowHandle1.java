package Popups;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.ArrayList;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.devtools.v112.browser.model.WindowID;
//import org.openqa.selenium.devtools.v110.browser.model.WindowID;

public class WindowHandle1 {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace\\Selenium_automation1\\Resource\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://hrm.flourisense.in/web/index.php/auth/login");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[contains(text(),'OrangeHRM, Inc')]")).click();
		
		Thread.sleep(3000);
		Set<String>Window=driver.getWindowHandles();  //it is used to open window id in the set data
		
		//first method
		
		Iterator<String>It=Window.iterator();
		
		String ParentWindow=It.next();
		
		String ChildWindow=It.next();
		
		System.out.println("Parent Window-------->"+ParentWindow);
		
		
		System.out.println("Child Window-------->"+ChildWindow);
		
		//second method
		
		List<String> Windowlist=new ArrayList(Window);
		
		String Parent=Windowlist.get(0);
		String Child=Windowlist.get(1);
		
	System.out.println("Parent Window-------->"+Parent);
		
		
		System.out.println("Child Window-------->"+Child);
		
		//how to switch selenium focus on child window
		
		driver.switchTo().window(ParentWindow);
		System.out.println("Parentwindow------>"+driver.getTitle());
		
		driver.switchTo().window(ChildWindow);
		System.out.println("Childwindow------>"+driver.getTitle());
		
		driver.quit();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
