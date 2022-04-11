package stringRelatedPrograms;

import java.util.LinkedHashMap;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;



public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//input = "kanagaraj"; letter - a
		
		String name = "kjavarrr";
		char[] c = name.toCharArray();
		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		for (int i = 0; i < c.length; i++) {
			if(!map.containsKey(c[i])) {
				map.put(c[i], 1);
			}
			
			else {
				int oldValue = map.get(c[i]);
				int newValue=oldValue+1;
				map.put(c[i], newValue);
				
			}
		}
		Set<Map.Entry<Character, Integer>> hmap = map.entrySet();
		int maxcount=0;
		char key=' ';
		for(Map.Entry<Character, Integer> data:hmap) {
			
			if(data.getValue()>maxcount) {
				maxcount=data.getValue();
				key=data.getKey();
			}
			
			
		
		}
		System.out.println(maxcount);
		System.out.println(key);
		
		
		
		
		
	}
}
