package ArrayRelatedPrograms;

import java.util.Arrays;

public class TC01_HowToRemoveDuplicatesFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[]= {1,3,2,1,2,5,6,6,3,3,2};
		Arrays.sort(array);
		
		for (int i = 0; i < array.length; i++) 
		{
			int count=0;
			for (int j = i+1; j < array.length; j++) 
			{
				if(array[i]==array[j])
						{
						count=1;
						}
			}
			if(count==0) {
				System.out.println(array[i]);
			}
			
		}
		
		

	}

}
