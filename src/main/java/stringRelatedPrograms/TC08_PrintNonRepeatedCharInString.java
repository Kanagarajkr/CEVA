package stringRelatedPrograms;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class TC08_PrintNonRepeatedCharInString {

	public static void main(String[] args) {
		// Print non repeated character in string, eg:Program-->p,o,g,a,m is answer

		// Step 1: Putting the string into Map
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
		for(Map.Entry<Character, Integer> data:hmap)
		{
			if(data.getValue()==1)
			{
				System.out.println(data.getKey());
				
			}
			
			
			


		}
	

		







	}





}

