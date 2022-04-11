package javacode;

public class PalindromeString {
	
	 String reverse="";

	public static void main(String[] args) 
	{
		
	PalindromeString ps = new PalindromeString();
	ps.getReverse("madam");
		
	}
	
	 public void getReverse(String input) 
	 {
		 for (int i = input.length()-1; i >=0; i--)
		 {
			reverse = reverse+ input.charAt(i);
		 }
		 
		 if(reverse.equalsIgnoreCase(input))
			{
				System.out.println("Yes , palindrome");
			}
			else 
			{
				System.out.println("Not a palindrome");
			}
	 }

}
