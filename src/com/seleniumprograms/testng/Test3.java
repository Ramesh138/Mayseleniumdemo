package com.seleniumprograms.testng;

import org.testng.annotations.Test;

public class Test3 {
	@Test
	public void m1() {
		
		System.out.println(" 1");
		throw new Error();
	}
	
	@Test
	public void m3() {
		
		System.out.println(" 2");
		throw new Error();
	}
	
	@Test
	public void m2() {
		
		System.out.println(" 3");
		throw new Error();
	}

}
