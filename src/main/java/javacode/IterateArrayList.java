package javacode;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IterateArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(12);
		list.add(11);
		list.add(13);
		list.add(13);
		
		Iterator<Integer> it = list.iterator();
		while(it.hasNext()) {
			Integer next = it.next();
			System.out.println(next);
		}
		
		

	}

}
