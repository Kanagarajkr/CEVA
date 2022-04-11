package javacode;

import java.util.Arrays;

public class FindSmallNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int no = 239;
		int reverse =0;
		while(no!=0) {
		
			int remainder = no%10;
			reverse = reverse*10+remainder;
			no=no/10;
		}
		
		System.out.println(reverse);

	}

}
