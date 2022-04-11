package selenium;

import org.testng.annotations.Test;

public class GenerateRandomno {
	
	
	//This is a testcase
	
	@Test(timeOut=300)
	public void runRandom() throws InterruptedException {
	double random = Math.random()*1000;
	long longno = ((long)(random));
	System.out.println(longno);
	Thread.sleep(longno);
		

	}

}
