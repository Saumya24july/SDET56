package Assignament;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LastNameTextField_Hyrtutorials {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
		WebElement LasrName_TextFiled = driver.findElement(By.xpath("//label[.='Last Name' ]/following-sibling::input[@name='name']"));
		LasrName_TextFiled.sendKeys("Behera");
	}

}
