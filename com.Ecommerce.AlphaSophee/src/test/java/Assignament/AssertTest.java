package Assignament;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import  static org.testng.Assert.*;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertTest {
	
	static int a=8;

	/*
	 * @Test public void m1() { String
	 * expectedTitle="News: Today's News Headlines & Daily Updates from Sports, Movies, Politics, Business"
	 * ; WebDriver driver=new ChromeDriver(); driver.manage().window().maximize();
	 * driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 * driver.get("https://www.news18.com"); String actualTitle = driver.getTitle();
	 * assertEquals(actualTitle, expectedTitle);
	 * 
	 * Reporter.log(actualTitle,true);
	 * 
	 * 
	 * }
	 * 
	 * @Test public void m2() { String
	 * expectedTitle="Live Cricket Score, Schedule, Latest News, Stats & Videos | Cricbuzz.com"
	 * ; WebDriver driver=new ChromeDriver(); driver.manage().window().maximize();
	 * driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 * driver.get("https://www.cricbuzz.com"); String actualTitle =
	 * driver.getTitle(); assertSame(actualTitle, expectedTitle);
	 * 
	 * Reporter.log(actualTitle,true);
	 * 
	 * 
	 * }
	 */
	@Test
	public void m3()
	{
	
		
		assertNotNull( a);
		Reporter.log("paased", true);
		
		
	}
	@Test
	public void m4()
	{
	SoftAssert soft = new SoftAssert();
		
	soft.assertNotNull( a);
		Reporter.log("paased", true);
		soft.assertAll();	
		
		
	}
	
	
	
	
	
	
	
	
	
	

}
