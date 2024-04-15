package Assignament;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class BaseClassPractice {

	
	
	@Test
	public void testScript()
	{
		System.out.println("My test Script  got passed");
	}
	
	
	
	@BeforeClass
	public void CoonectingToBrowser()
	{
		System.out.println("My Browser got connected");
	}

	@BeforeMethod
	public void LogInToapplication()
	{
		System.out.println("Login into Application");
	}
	
	@BeforeSuite
	public void DataBaseConnection()
	{
		System.out.println("Connecting to DataBase");
	}
	
	@AfterClass
	public void CloseTheBrowser()
	{
		System.out.println("My Browser got Closed");
	}
	@AfterMethod
	public void LogOutFromApplication()
	{
		System.out.println("LogOut From Application");
	}
	@AfterSuite
	public void CloseConnection()
	{
		System.out.println("Close DataBase");
	}
	
}

