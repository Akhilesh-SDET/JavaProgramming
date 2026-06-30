package Pratice;

import org.testng.IRetryAnalyzer;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer {

	private int count = 0;
	private static final int MAXRETRYCOUNT = 3;

	@Override
	public boolean retry(ITestResult arg0) {

		if (count < MAXRETRYCOUNT) {
			count++;
			return true; 
		}
		return false;
	}

}
