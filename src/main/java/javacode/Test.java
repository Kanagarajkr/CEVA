package javacode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> list1= new ArrayList<>();
		list1.add("apple");
		list1.add("apple");
		list1.add("banana");
		list1.add("cake");
		list1.add("cake");
		
		for(int i=0;i<list1.size();i++)
		{
		int flag=0;
			for(int j=i+1;j<list1.size();j++)
			{
				if(list1.get(i).equals(list1.get(j)))
				{
					flag=1;
				}
			}
			
			if(flag==0)
			{
				System.out.println(list1.get(i));
			}
		}
		
		
		

	}

}
