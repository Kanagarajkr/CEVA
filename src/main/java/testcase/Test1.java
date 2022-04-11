package testcase;

import java.util.NoSuchElementException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test1 {
	@Test(dependsOnMethods= {"testcase.Test1.runTest1"})
	public void runTest0() {
		System.out.println("Before");
	}
	@Test
	public void runTest1() {
		System.out.println("Test1");
		throw new NoSuchElementException();
	}
	@Test
	public void runTest2() {
		System.out.println("Test2");
	}

}
