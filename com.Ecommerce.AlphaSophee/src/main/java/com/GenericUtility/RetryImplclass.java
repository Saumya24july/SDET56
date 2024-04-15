package com.GenericUtility;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryImplclass implements IRetryAnalyzer {
	int lowercount=0;
	int uppercount=3;
	public boolean retry(ITestResult result) {
		if(lowercount<uppercount)
		{
			lowercount++;
			return true;
		}
		return false;
	}

	

	
	
}
