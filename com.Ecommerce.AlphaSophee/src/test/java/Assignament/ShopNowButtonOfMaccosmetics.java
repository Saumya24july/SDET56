package Assignament;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShopNowButtonOfMaccosmetics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.maccosmetics.com");
		WebElement ShopNowButton = driver.findElement(By.xpath("//span[.='SHOP NOW']"));
		ShopNowButton.click();

	}

}
