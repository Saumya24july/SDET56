package Assignament;

import org.testng.annotations.Test;

import com.GenericUtility.BaseClass;

public class TestyantraDemoTest {
	
	

	@Test
	public void g1()
	{
		System.out.println(" g1"+" "+Thread.currentThread().getId());	
	}
	
	@Test
	public void h1()
	{
		System.out.println("h1"+" "+Thread.currentThread().getId());	
	}
	@Test
	public void i1()
	{
		System.out.println("i1"+" "+Thread.currentThread().getId());	
	}
	

}
