package com.cwm;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class BeforeAndAfterAnotation {

	@BeforeClass
	public static void beforClass() {
		System.out.println("Excuted Before Class");
	}
	@Before
	public void setup() {
		System.out.println("Before Executed");
	}
	@Test
	public void test1() {
		System.out.println("Test one executed!");
	}
	
	@Test
	public void test2() {
		System.out.println("Test two executed!");
	}

	@After
	public void tearDown() {
		System.out.println("After Executed");
	}
	
	
	@AfterClass
	public static void afterClass() {
		System.out.println("Executed After class");
	}
}
