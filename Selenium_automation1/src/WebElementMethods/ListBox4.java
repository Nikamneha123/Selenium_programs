package WebElementMethods;

   /*import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ListBox4 {
	
	WebElement Select_Skills =driver.findElement(By.id("Skills"));
	
	//1.....How will u get the total no size of list
	
	Select S1=new Select(Select_Skills);
	List<WebElement> Skills=S1.getOptions();
	
	System.out.println("TotalSkills------->"+Skills.size());
	
	//2.........how will u print all the values
	
	for(int i=0;i<Skills.size();i++) {
		
		String Skills1=Skills.get(i).getText();
		
		System.out.println(Skills1);
		
		//HOW WILL U SELECT SPECIFIC VALUES FROM THE DROPDOWN
		
		if(Skills1.equals("APIS")) {
			
			Skills.get(i).click();	
			
			
		}
	}
	WebElement Skills = driver.findElement(By.xpath("//select[@id='Skills']"));
	
	//to get total size of the list
	
	Select s1 = new Select(Skills);
	List<WebElement> Listskills = s1.getOptions();
	System.out.println(Listskills.size());
	// to get all the skiils from list
	for(int i = 0; i< Listskills.size(); i++) {
		String skillvalues= Listskills.get(i).getText();
		System.out.println(skillvalues);
	
		if(skillvalues.equals("APIs")) {
			Listskills.get(i).click();
		}
		
	}

}*/
