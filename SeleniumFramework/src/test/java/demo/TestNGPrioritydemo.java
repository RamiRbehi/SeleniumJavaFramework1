package demo;

import org.testng.annotations.Test;

public class TestNGPrioritydemo {

	@Test
	public void one() {
		System.out.println("I am inside Test 1");

	}

	@Test(priority = 1)
	public void two() {
		System.out.println("I am inside Test 2");

	}
//	(priority = 1)
	@Test(priority = 1)
	public void three() {
		System.out.println("I am inside Test 3");

	}

}
