package javacode;

import java.util.Scanner;

public class ReverseString {
	
	public static void main(String[] args) {
		/*
		 * String input = "kanagaraj"; String reverse =""; int length = input.length();
		 * //System.out.println(length);
		 * 
		 * for (int i =length-1; i>=0; i--) //8 { reverse = reverse+input.charAt(i);
		 * System.out.println(reverse); }
		 */
		/*
		 * String input = "Kanagaraj"; StringBuilder sb = new StringBuilder(input);
		 * System.out.println(sb.toString());
		 * 
		 * StringBuilder reverse = sb.reverse(); System.out.println(reverse.toString());
		 */
		String input = "madam";
		String reverse="";
		for (int i = input.length()-1; i >=0; i--) {
			reverse=reverse+input.charAt(i);
		}
			System.out.println(reverse);
			if(input.equalsIgnoreCase(reverse)) {
				System.out.println("yes palindrome");
			}
			else {
				System.out.println("No palindrome");
			}

	}
	}


