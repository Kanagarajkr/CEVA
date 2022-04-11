package selenium;

public class LearnException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=10;
		int y=2;
		int[] num= {1,2,2};
		
		try {
			System.out.println(x/y);
			System.out.println(num[1]);
		 
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		finally {
			System.out.println("I am finally");
		}
		
		}
	}
	


