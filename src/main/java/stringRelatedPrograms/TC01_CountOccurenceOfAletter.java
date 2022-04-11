package stringRelatedPrograms;

import java.util.Scanner;

public class TC01_CountOccurenceOfAletter {

	public static void main(String[] args) {
		//question: print the occurence of a in below input string
		// input = "welcome to Decentraland"
		//output =2
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the input: ");
		String firstStr = sc.next();
		int lengthBefore = firstStr.length();
		int lengthAfter = firstStr.replace("a", "").length();
		int count = lengthBefore - lengthAfter;
		System.out.println(count);
		

	}

}
