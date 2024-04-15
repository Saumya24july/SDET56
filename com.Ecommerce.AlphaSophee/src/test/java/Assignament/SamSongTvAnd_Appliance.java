package Assignament;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SamSongTvAnd_Appliance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// TODO Auto-generated method stub
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				driver.get("https://www.flipkart.com");
				
				driver.findElement(By.xpath("//img[@alt='Mobiles']")).click();
				
				Actions action = new Actions(driver);
				
				WebElement TvAppliance = driver.findElement(By.xpath("//span[contains(.,'TVs & Appliances')]"));

				
				action.moveToElement(TvAppliance).perform();
				WebElement Samsung = driver.findElement(By.xpath("//a[@title='Samsung']"));
				action.click(Samsung).perform();
				

	}

}
