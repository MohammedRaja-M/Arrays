package com.array;

import java.util.Arrays;
import java.util.Collections;

public class ArrayString {
	public static void main(String[] args) {
		String[] s = {"NazriyaNazeem" , "DisaPathani" , "Aliabhat" ,"Trisha"};
		Arrays.sort(s);
		System.out.println("The Ascending Order Of The Actresses Are: " + Arrays.toString(s));
		System.out.println("");
		
		Arrays.sort(s , Collections.reverseOrder());
		System.out.println("The Descending Order Of The Actresses Are: " + Arrays.toString(s));
	}

}
