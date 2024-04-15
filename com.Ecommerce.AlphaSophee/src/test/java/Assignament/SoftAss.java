package Assignament;

import org.testng.asserts.SoftAssert;

public class SoftAss {
	
	public void m1()
	
	{
	SoftAssert soft = new SoftAssert();
	System.out.println("--line -1");
	System.out.println("--line -2");
	soft.assertNotEquals("A","B","Both are not equal");
	System.out.println("--line -3");
	
	}
}
