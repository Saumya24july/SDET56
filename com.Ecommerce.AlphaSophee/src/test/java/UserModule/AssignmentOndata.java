package UserModule;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Adminmodule.AssignamentOndatapRovider;

public class AssignmentOndata {
	WebDriver driver;
	
	@Test(priority=0,retryAnalyzer = com.GenericUtility.RetryImplclass.class)
	public void m2()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/campaign/landing.php");
		
	}

	@Test(priority=1,dataProviderClass = AssignamentOndatapRovider.class,dataProvider = "m1")
	public void m3(String name,String title,String ph,String password)
	{
		driver.findElement(By.name("firstname")).sendKeys(name);
		driver.findElement(By.name("lastname")).sendKeys(title);
		driver.findElement(By.name("reg_email__")).sendKeys(ph);
		driver.findElement(By.name("reg_passwd__")).sendKeys(password);
		
	}
	
	
}
