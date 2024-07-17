package com.cwm;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class BeforeAndAfterAnotation {

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
}
