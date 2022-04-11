package selenium;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class LearnRetryAnalyzer implements IRetryAnalyzer{
	
	int maxretry = 3;
	int count =0;

	@Override
	public boolean retry(ITestResult result) {
		if(!result.isSuccess()&& count<maxretry) {
			count++;
			return true;
		}
		// TODO Auto-generated method stub
		return false;
	}

}
