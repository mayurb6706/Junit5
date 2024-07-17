package com.cwm;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class TestWithParameters {

	private String input;
	private String expectedOutput;
	
	
	public TestWithParameters(String input, String expectedOutput) {
		super();
		this.input = input;
		this.expectedOutput = expectedOutput;
	}
	
	@Parameters
	public static Collection<String[]> retuenInputCollection(){
		String[][] strings= {
				{"AABG","BG"},{"ATG","TG"}
		};
		return Arrays.asList(strings);
	}
	StringHelper helper= new StringHelper();
	@Test
	public void test() {
		assertEquals(expectedOutput, helper.truncateAInFirst2Positions(input));
	}

}
