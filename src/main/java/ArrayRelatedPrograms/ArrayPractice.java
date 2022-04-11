package ArrayRelatedPrograms;

import java.util.Arrays;

public class ArrayPractice {

	public static void main(String[] args) {
	int a[] = {1,3,2,1,3};
	Arrays.sort(a);
	for(int i=0;i<a.length;i++) {
		int count = 0;
		for(int j=i+1;j<a.length;j++) 
		{
			if(a[i]==a[j]) {
				count=1;
			}
			
		}
		if(count==0) {
			
			System.out.println(a[i]);
			
		}
	}
		
		}

	}


