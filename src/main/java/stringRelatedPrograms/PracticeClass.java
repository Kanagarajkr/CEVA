package stringRelatedPrograms;

import java.util.Scanner;

public class PracticeClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "my name is kr";
		String[] split = input.split(" ");
		String reverse="";
		for (int i = split.length-1; i >=0; i--) {
			reverse = reverse+split[i]+" ";
		}
		System.out.println(reverse);
	}

}
