package stringRelatedPrograms;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class TC09_PrintFirstNonRepeatedChar {

	public static void main(String[] args) {
		// Print first non repeated character from String
		//input = "alibaba"-->
		String input = "ababa";

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
		//Step2:
		Set<Entry<Character,Integer>> hmap = map.entrySet();
		for(Map.Entry<Character, Integer> data:hmap)
		{
			if(data.getValue()==1)
			{
				System.out.println(data.getKey());
				System.exit(0);
				
			}
			
			
			


		}
	

		







	}


	}


