package com.cwm;

public class StringReverse {


public String reversString(String str) {
	
	String reverse="";
	
	for(int i=str.length()-1;i>=0;i--) {
		reverse=reverse+str.charAt(i);
	}

	return reverse;
}
}
