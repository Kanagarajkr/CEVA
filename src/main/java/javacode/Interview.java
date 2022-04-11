package javacode;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Interview {

	public static void main(String[] args) {
		// Write a program to get non-recurring/repeating characters from a string.
		//Input = "Automation"
			//	Output= [u,m,i,n]
		
		String input = "Automation";//Aumain
		char[] c = input.toCharArray();
		String lowerCase = input.toLowerCase();
		Map<Character,Integer> map = new LinkedHashMap<Character,Integer>();
		for (int i = 0; i <c.length; i++)
		{
			if(!map.containsKey(c[i]))
			{
				map.put(c[i], 1);
			}
			
			else
			{
				int newValue = map.get(c[i])+1;
				map.put(c[i], newValue);
			}
		}
		
		
		Set<Entry<Character, Integer>> entrySet = map.entrySet();
		for(Map.Entry<Character, Integer> data:entrySet) {
			if(data.getValue()==1) {
				System.out.println(data.getKey());
				
				//System.out.println(data.getValue());
				
			}
		}
		
		
		
		

	}

}
