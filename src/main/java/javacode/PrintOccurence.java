package javacode;

import java.util.HashMap;
import java.util.Map;

public class PrintOccurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Welcomeo";
		/*int count =0;
		char c = str.charAt(0);
		for (int i = 0; i < str.length(); i++) {
			if (c == str.charAt(i)) {
				count++;
			}
		}
		System.out.println(c + " occurs " + count + " times in " + str);
	}*/
		char[] char_array =str.toCharArray();
		Map<Character,Integer> charCounter=new HashMap<Character,Integer>();
		for (char ch : char_array) {
			if(charCounter.containsKey(ch)){
				charCounter.put(ch, charCounter.get(ch)+1);
			} 
			else{
				charCounter.put(ch, 1);
			}
		}
		System.out.println(charCounter);
	}

}
