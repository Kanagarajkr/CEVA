package javacode;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no = 892;
		int reverse =0;
		int remainder;
		
		while(no!=0) {
			
			remainder=no%10;                   //2      
			reverse=reverse*10+remainder;        //2
			no=no/10;        //89
		}
		System.out.println(reverse);
	}

}
