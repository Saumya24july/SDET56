package Adminmodule;

import org.testng.annotations.DataProvider;

public class AssignamentOndatapRovider {
	
	
	

	@DataProvider
	public Object[][] m1()
	{
		Object[][] obj = new Object[1][4];
		
		obj[0][0]="Soumya";
		obj[0][1]="Behera";
		
		obj[0][2]="saumya24july@gmail.com";
		obj[0][3]="12345";
		
		return obj;
		
	}

}
