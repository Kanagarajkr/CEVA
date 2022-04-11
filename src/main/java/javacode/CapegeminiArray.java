package javacode;

import java.util.Arrays;

public class CapegeminiArray {
	
	public static void main(String[] args) {
		
		int input[]= {1,0,0,1,1,0,1};
		Arrays.sort(input);
		for (int i = input.length-1; i >0; i--) {
			System.out.println(input[i]);
		}
	}

}

