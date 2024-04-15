package Assignament;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Adminmodule.AssignamentOndatapRovider;

public class DataproviderImplementation {
	
	
	public class AssignmentOndata {
		WebDriver driver;
		
	

		@Test(priority=0,dataProviderClass = DataProvi.class,dataProvider = "m1")
		public void m3(String Username,String password)
		{
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("http://rmgtestingserver/domain/Online_Shopping_Application/admin/");
			driver.findElement(By.id("inputEmail")).sendKeys(Username);
			driver.findElement(By.id("inputPassword")).sendKeys(password);
			driver.findElement(By.xpath("//button[.='Login']")).click();
			
		}
		
		

	}}
