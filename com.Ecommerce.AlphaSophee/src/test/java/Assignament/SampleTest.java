package Assignament;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.GenericUtility.BaseClass;

public class SampleTest{

	@Test
	public void a1()
	{
	System.out.println("a1"+" "+Thread.currentThread().getId());
	}
	
	@Test
	public void b1()
	{
		System.out.println(" b1"+" "+Thread.currentThread().getId());	
	}
	@Test
	public void c1()
	{
		System.out.println("c1"+" "+Thread.currentThread().getId());	
	}
}
