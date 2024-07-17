package com.cwm;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringHelperTest {

	StringHelper stringHelper = new StringHelper();
	
	@Test
	public void testtTruncateAInFirst2Positions_AinFirstTwoPosition() {

		

		assertEquals("bc", stringHelper.truncateAInFirst2Positions("AAbc"));
	}

	
	@Test
	public void testTruncateAInFirst2Positions_AinFirstPosition() {
		
		assertEquals("bc", stringHelper.truncateAInFirst2Positions("Abc"));
		
	}
	
	@Test
	public void testTruncateAInFirst2Positions_AisNotPresent() {
		
		assertEquals("DDEF", stringHelper.truncateAInFirst2Positions("DDEF"));
		
	}
	
	@Test
	public void testTruncateAInFirst2Positions_AisatLastPosition() {
		
		assertEquals("EGGA", stringHelper.truncateAInFirst2Positions("EGGA"));
		
	}
}