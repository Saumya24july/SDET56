package Assignament;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class YouTubeSongPlay {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.youtube.com");
		
		
		Actions action=new 	Actions(driver);
		WebElement ele = driver.findElement(By.id("search-input"));
		action.sendKeys(ele, "Song").perform();
		
		List<WebElement> element = driver.findElements(By.xpath("//div[@class='sbsb_a']/ul/li"));
		
		
		for(WebElement indivi:element)
		{
			System.out.println(indivi.getText()+" ");
			if(indivi.getText().contains("new"))
			{
				indivi.click();
				break;
				
			}
			
		}
	
		
		
	}

}
