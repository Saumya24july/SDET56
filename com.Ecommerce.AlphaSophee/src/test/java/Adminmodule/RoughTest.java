package Adminmodule;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.time.Duration;
import java.util.List;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class RoughTest {
	WebDriver driver;
	@Test(priority = -1)
	public void t1()
	{
		driver=new ChromeDriver();	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/signup");
	}
	
	
		
	
	@Test(dataProvider = "org",priority = 2)
	public void m1(String name,String title,String ph,String password)
	{
		driver.findElement(By.name("firstname")).sendKeys(name);
		driver.findElement(By.name("lastname")).sendKeys(title);
		driver.findElement(By.name("reg_email__")).sendKeys(ph);
		driver.findElement(By.name("reg_passwd__")).sendKeys(password);
	}
	
	@DataProvider(name="org")
	public Object[][] data()
	{
		Object[][] obj = new Object[1][4];
		
		obj[0][0]="Soumya";
		obj[0][1]="Behera";
		
		obj[0][2]="subha";
		obj[0][3]="BBBB";
		
		return obj;
		
	}
	
	
	
	}


