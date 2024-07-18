package com.cwm;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class StringReverseTest {

	StringReverse reverse= new StringReverse();
	private String input;
	private String output;
	
	public StringReverseTest(String input, String output) {
		super();
		this.input=input;
		this.output=output;
	}
	
	@Parameters
	public static Collection<String[]> inputStringRevers(){
		String str[][]= {
				{"ab","ba"},	{"abc","cba"}, {"reverse","esrever"},{"akash","hsaka"},
		};
		
		return Arrays.asList(str);
	}
	
	
	@Test
	public void testReversString() {
		assertEquals(output, this.reverse.reversString(input));
	}
	
}
