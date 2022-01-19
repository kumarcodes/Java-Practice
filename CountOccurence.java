package com.java.rohit;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class CountOccurence {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		str=str.replaceAll(" ", "");
		String s=str.toLowerCase();
		LinkedHashMap<Character, Integer> hm=new LinkedHashMap<Character, Integer>();
		for(int i=0;i<s.length();i++) {
			if(hm.containsKey(s.charAt(i))) {
				hm.put(s.charAt(i), hm.get(s.charAt(i))+1);
			}
			else {
				hm.put(s.charAt(i), 1);
			}
			
		}
		for(Entry<Character,Integer> entry:hm.entrySet()) {
			System.out.print(entry.getKey()+""+entry.getValue()+" ");
		}
		

	}

}
