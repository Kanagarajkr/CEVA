package javacode;

import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class TestClass
{
	
	public static void main(String[] args) throws IOException 
	{
		
		List<String> fruits = new LinkedList<String>();
		fruits.add("apple");
		fruits.add("apple");
		fruits.add("orange");
		fruits.add("mango");
		System.out.println(fruits);
		
		Set<String> fruits1 = new LinkedHashSet<String>(fruits);
		/*
		 * Iterator<String> it = fruits1.iterator(); while(it.hasNext()) {
		 * System.out.println(it.next()); }
		 */
		for(String data:fruits1) {
			System.out.println(data);
		}
		
		
		
		
		
			
		
		
	}
}
	


