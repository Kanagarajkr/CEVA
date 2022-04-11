package stringRelatedPrograms;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class TC02_CountOccurenceofEachLetter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input="java";
		char[] c = input.toCharArray();
		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		for (int i = 0; i < c.length; i++) {
			if(!map.containsKey(c[i])) {
				map.put(c[i], 1);
			}
			else
			{
				int oldvalue=map.get(c[i]);
				int newvalue=oldvalue+1;
				map.put(c[i], newvalue);
			}
		}
		Set<Entry<Character, Integer>> hmap = map.entrySet();
		for (Map.Entry<Character, Integer> data:hmap) {
			System.out.print(data.getKey());
			System.out.println(data.getValue());
		}
		

	}

}
