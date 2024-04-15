package Assignament;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.GenericUtility.BaseClass;

public class DemoTest  {
	
	@Test
	public void d1()
	{
		System.out.println("d1"+" "+Thread.currentThread().getId());	
	}
	
	@Test
	public void f1()
	{
		System.out.println(" f1"+" "+Thread.currentThread().getId());	
	}
	@Test
	public void e1()
	{
		System.out.println("e1"+" "+Thread.currentThread().getId());	
	}
	
	
	
	

}
