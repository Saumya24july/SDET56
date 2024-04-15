package Assignament;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class MyntraMensJacket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.myntra.com");

		WebElement menSection = driver.findElement(By.xpath("//a[@data-group='men']"));

		Actions action = new Actions(driver);
		action.moveToElement(menSection).perform();
		WebElement jacket = driver.findElement(
				By.xpath("//div[@class='desktop-categoryContainer' and @data-group='men']/descendant::a[.='Jackets']"));
		jacket.click();

		List<WebElement> jacketCount = driver.findElements(By.xpath("//img"));

		System.out.println(jacketCount.size());

		WebElement dropDown = driver
				.findElement(By.xpath("//span[@class='myntraweb-sprite sort-downArrow sprites-downArrow']"));
		action.moveToElement(dropDown).perform();
		driver.findElement(By.xpath("//label[contains(.,'Customer Rating')]")).click();
		driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']"))
				.sendKeys("Mango Man Shirts", Keys.ENTER);

		driver.findElement(By.xpath(
				"//img[contains(@title,'MANGO MAN Regular')]")).click();
		 WebElement sizechart = driver.findElement(By.xpath("//button[text()='Size Chart']"));
		action.click(sizechart).perform();
		
		//driver.findElement(By.xpath("//button[text()='Size Chart']")).click();
	//	WebElement size = driver.findElement(By.xpath("//input[@id='90368991' and @type='radio'] "));
		//action.click(size).perform();
		//driver.findElement(By.xpath("//div[contains(.,'ADD TO BAG') and contains(@class,'pdp-ad')]")).click();
	}

}
