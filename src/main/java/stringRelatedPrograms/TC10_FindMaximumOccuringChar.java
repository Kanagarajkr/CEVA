package stringRelatedPrograms;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class TC10_FindMaximumOccuringChar {

	public static void main(String[] args) {
		// Find the maximum occuring character in a string
		//input="Rajanar" -->a
		String input = "ragnarrajan";

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
		int maxValue=0;
		char maxKey=' ';
		for(Map.Entry<Character, Integer> data:hmap)
		{
			if(data.getValue()>maxValue)
			{
				maxValue=data.getValue();
				maxKey=data.getKey();
				
			}
			
			
		}
		
		System.out.println(maxKey);
		System.out.println(maxValue);
	

		


	}

}
