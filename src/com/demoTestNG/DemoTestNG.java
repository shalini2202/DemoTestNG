package com.demoTestNG;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DemoTestNG {
	
	@Test(priority = 0)
	public void demo()
	{
		System.out.println("om");
	}

	@Test(priority = 1)
	public void a()
	{
		System.out.println(" namah shivaya");
	}
}
