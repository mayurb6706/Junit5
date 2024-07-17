package com.cwm;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;

public class ComparingArrays {

	@Test
	public void testArrayEqual() {
		
		int[] number= {10,30,45,80,56};
		
		Arrays.sort(number);
		
		int[] expected= {10,30,45,56,80};
		
//		Following method will comapre the memory addresses of given array
//	java.lang.AssertionError: expected:<[I@5ef60048> but was:<[I@1d548a08>
		
//		assertEquals(expected,number);
		
		assertArrayEquals(expected, number);
	}
	
	//Checking Exception
	
	@Test
	public void testArrayNullArray() {
//		By using try and catch Block
		int[] numbers=null;
		try {
		Arrays.sort(numbers);
		}
		catch (NullPointerException e) {
//			Success
		}
		
	}
	@Test(expected = NullPointerException.class)
	public void testArrayNullPointerExceprion(){
		int[] numbers=null;
		Arrays.sort(numbers);
	}
	


}
