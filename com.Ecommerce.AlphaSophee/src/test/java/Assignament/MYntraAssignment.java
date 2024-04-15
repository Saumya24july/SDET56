package Assignament;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MYntraAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.myntra.com");
		WebElement Home_Living = driver.findElement(By.xpath("//a[.='Home & Living']"));

		Actions action = new Actions(driver);
		action.moveToElement(Home_Living).perform();
		
		WebElement homen = driver.findElement(By.xpath("//a[.='Home Décor']"));
		action.moveToElement(homen).perform();
		
		
		  List<WebElement> HomeDecorLIst = driver .findElements(By.
		  xpath("//ul[@class='desktop-navBlock' and @data-reactid='575']/li"));
		 
		  
		 
		 for (WebElement ele : HomeDecorLIst) {
			 System.out.println(ele.getText()+" ");
			 
		 
			  { 
		  
		  }
		  
		  
		  
		 
		
		
		}
	}
}
