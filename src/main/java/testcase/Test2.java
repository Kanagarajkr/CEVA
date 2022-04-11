package testcase;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test2 {
	
	
		@BeforeTest
		public void runTest2() {
			System.out.println("BeforeTest");
		}

	
		
		@Test
		public void runTest3() {
			System.out.println("Test3");
		}
		@Test
		public void runTest4() {
			System.out.println("Test4");
		}


}
