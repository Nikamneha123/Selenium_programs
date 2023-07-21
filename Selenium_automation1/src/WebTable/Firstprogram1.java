package WebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Firstprogram1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace\\Selenium_automation1\\Resource\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		WebElement Element=driver.findElement(By.xpath("//h3[text()='Example']"));
		js.executeScript("arguments[0].scrollIntoView();", Element);
		
		//how many rows in the table
		
		int row=driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr")).size();
		System.out.println("Total no of rows=========>"+row);
		
		//how many cols in the table
		
		int cell=driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr/th")).size();
		System.out.println("Total no of rows=========>"+cell);
		
		//get the data on specific row or cell
		
	    String data=	driver.findElement(By.xpath("//table[@id=\"customers\"]/tbody/tr[2]/td[1]")).getText();
	
	    System.out.println(data);
	    
	    //get all rows n ells
	    
	    for(int i=2;i<=row;i++) {
	    	for(int j=1;j<=cell;j++) {
	    		
	     String data1=driver.findElement(By.xpath("//table[@id=\"customers\"]/tbody/tr["+ i +"]/td["+ j +"]")).getText();
	     
	     System.out.println(data1);
	    	}
	    	
	    	System.out.println();
	    }
	
	
		
		
		
		
		
		
		

	}

}
