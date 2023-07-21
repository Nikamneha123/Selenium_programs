package WebElementMethods;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBox3 {
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
		
		//1.....How will u get the total no size of list
		
		Select S1=new Select(day);
		List<WebElement> ListDay=S1.getOptions();
		
		System.out.println("TotalDays------->"+ListDay.size());
		
		//2.........how will u print all the values
		
		for(int i=0;i<ListDay.size();i++) {
			
			String DayValues=ListDay.get(i).getText();
			
			System.out.println(DayValues);
			
			//HOW WILL U SELECT SPECIFIC VALUES FROM THE DROPDOWN
			
			if(DayValues.equals("20")) {
				
				ListDay.get(i).click();	
			}
		}
		
		//select month
		
		Select S2=new Select(Month);
		
		List<WebElement> Monthvalues=S2.getOptions();
		
		System.out.println("Total month--------->"+Monthvalues.size());
		
		System.out.println();
		
		for(int j=0;j<Monthvalues.size();j++) {
			
			String Months=Monthvalues.get(j).getText();
			System.out.println(Months);
			
			if(Months.equals("May")) {
				
				Monthvalues.get(j).click();
				
			}
			
		}
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	

}
