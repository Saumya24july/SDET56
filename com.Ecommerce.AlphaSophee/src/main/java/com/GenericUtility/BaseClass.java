package com.GenericUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

public class BaseClass {
//hiii
	public WebDriverUtility wtil = new WebDriverUtility();
	public PropertiesFileutility putil = new PropertiesFileutility();
	public JaavUtility jutil = new JaavUtility();
	public WebDriverUtility wutil = new WebDriverUtility();
	public DataBaseUtility dutil = new DataBaseUtility();
	public ExcelFileUtility eutil = new ExcelFileUtility();
	public WebDriver driver;
	public static WebDriver sdriver;

	@BeforeSuite(alwaysRun = true)
	public void DBconnect() throws Throwable {
		dutil.connectDataBase();
		Reporter.log("---Connected To DataBase--", true);
	}

	//@Parameters("BROWSER")
	@BeforeClass(alwaysRun=true)
	public void openBrowser() throws Throwable {
		String BROWSER = putil.getpropertiesFileData("browser");

		if (BROWSER.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
			Reporter.log("--Launched Chrome Browser--", true);
		} else if (BROWSER.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
			Reporter.log("--LaunchedFireFox Browser--", true);
		} else {
			Reporter.log("---Inavlid Browser--", true);
		}
		sdriver=driver;
		wtil.maximize(driver);
		wtil.waitforPageLoad(driver, 20);
	}

	@AfterClass(alwaysRun = true)
	public void CloseBrowser() throws Throwable {
		Thread.sleep(2000);
		driver.quit();
		Reporter.log("---Browser---", true);
	}
	
	

	@AfterSuite(alwaysRun = true)
	public void DBconnectionCl() throws Throwable {
		dutil.closedatabase();
		Reporter.log("---Close The DataBase Connection---", true);
	}

}
