package Action_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouserightclick_contextclick {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace\\Selenium_automation1\\Resource\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		//WebDriver button=driver.findElement(By.xpath("//span[@class=\"context-menu-one btn btn-neutral\"]"));
		
		WebElement button=driver.findElement(By.xpath("//span[text()=\"right click me\"]"));
		
		Actions act=new Actions(driver);
		
          act.contextClick(button).build().perform();
          
          Thread.sleep(2000);
          
          driver.findElement(By.xpath("//span[text()=\"Copy\"]")).click();
          
          System.out.println(driver.switchTo().alert().getText());
          
          driver.switchTo().alert().accept();
          Thread.sleep(2000);
          
          act.contextClick(button).build().perform();
          
          Thread.sleep(2000);
          
 driver.findElement(By.xpath("//span[text()=\"Paste\"]")).click();//Paste
          
          System.out.println(driver.switchTo().alert().getText());
          
          driver.switchTo().alert().accept();
          
	}

}
