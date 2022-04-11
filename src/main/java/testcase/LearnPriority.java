package testcase;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LearnPriority {
	
	@Test(priority=-2)
	public void runOne() {
		System.out.println("Priority -2");
	}
	
	@Test(priority=1)
	public void runTwo() {
		System.out.println("Priority 1");
	}
	
	@Test(priority=0)
	public void runThree() {
		System.out.println("Priority -1");
	}
	
	@BeforeTest
	public void runFour() {
		System.out.println("Priority 2");
	}

}
