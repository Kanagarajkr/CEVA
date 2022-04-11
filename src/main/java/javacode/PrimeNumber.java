package javacode;

public class PrimeNumber {

	public static void main(String[] args) {
		isprime(6);
	}
		public static void isprime(int n) 
		{
			
			
			for(int i =2;i<=n;i++)
			{
				if(!(n%i==0&&n<1)) 
				{
					System.out.println("Yes, prime no.");
					break;
				}
				else {
					System.out.println("No prime no");
					break;
				}
			}
		}
		

	}


