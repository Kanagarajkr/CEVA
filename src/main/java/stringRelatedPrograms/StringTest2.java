package stringRelatedPrograms;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import io.opentelemetry.trace.TraceState.Entry;

public class StringTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input ="my name is kanagaraj";
		String reverse ="";
		
		String split[]=input.split(" ");
		
		for (int i = split.length-1; i >=0; i--) {
			reverse=reverse+split[i];
		}
		System.out.println(reverse);
		
			}}
