package stringRelatedPrograms;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class TC05_RemoveDuplicateCharFromString {

	public static void main(String[] args) {
		
		
	
		String input = "kanagaraj";

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
		String result="";
		for(Map.Entry<Character, Integer> data:hmap)
		{
			if(data.getValue()==1)
			{
				result=result+data.getKey();
				
			}
			
			
		
		}
		System.out.println(result);

	}}
