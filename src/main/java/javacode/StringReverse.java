package javacode;

public class StringReverse {

	public static void main(String[] args) {
		String str = "I love my country very much";
		String[] split1 = str.split(" ");  
		String reverse="";
		String ext= "hcum very yrtnuoc my evol I";
		
		for (int i = 0;  i< split1.length; i++) 
		{
			if(i%2==0) 
			{
				reverse = reverse+split1[i];
				i=i+1;
			}
			
		}
		System.out.println(reverse);
		
		for(int j=0;j<split1.length; j++)
		{
			if(j%3==0) 
			{
				reverse = reverse+split1[j];
			}
			
			
		}
		System.out.println(reverse);
		
		
		
		
		
		
		
		
		/*
		 * for (int i = str.length()-1; i>=0; i--) { reverse = reverse+ str.charAt(i);
		 * 
		 * } System.out.println(reverse); String[] split = reverse.split(" "); for (int
		 * i = 0; i <split.length; i--) { reverse = reverse+ split[i]; }
		 */
	}

}
