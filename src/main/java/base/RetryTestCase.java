package base;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryTestCase implements IRetryAnalyzer {

	
	@Override
	public boolean retry(ITestResult result) {
		
		return false;
	}
}
