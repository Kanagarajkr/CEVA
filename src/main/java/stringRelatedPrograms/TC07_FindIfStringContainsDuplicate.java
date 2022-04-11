package stringRelatedPrograms;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class TC07_FindIfStringContainsDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			
			
			// Step 1: Putting the string into Map
			String input = "SPIDERMAN";
			 
			Map<Character,Integer> map = new LinkedHashMap<Character,Integer>();
			char[] c = input.toCharArray();
			for (int i = 0; i < c.length; i++) 
			{
				if(!map.containsKey(c[i]))
				{
					map.put(c[i], 1);
				}
				
				else
				{
					int old = map.get(c[i]);
					int newValue = old+1;
					map.put(c[i], newValue);
					
				}
			}
			//Step 2: Printing Map
			//Set<Entry<Character, Integer>> entrySet = map.entrySet();
			//for(Map.Entry<Character, Integer> data:entrySet) 
			//{
				//System.out.print(data.getKey());
				//System.out.println(data.getValue());
			//}
			
			//Step 3: Program to find if String contains unique char or not
			Set<Entry<Character,Integer>> hmap = map.entrySet();
			for(Map.Entry<Character, Integer> data:hmap)
			{
				if(data.getValue()>1)
				{
					System.out.println("String contains duplicate characters");
					System.exit(0);
				}
				
			
			}
			
			System.out.println("Unique string");
			
			
				
			
			
			

		}

	

	}

