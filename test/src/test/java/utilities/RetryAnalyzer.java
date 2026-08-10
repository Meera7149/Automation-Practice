package utilities;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer {
	int count=0;
	int maxcount=2;
	@Override
	public boolean retry(ITestResult result) {
		
		if(count<maxcount) {
			count++;
			System.out.println("analyzer:done");
			return true;
		}
		return false;
		
	}

}
