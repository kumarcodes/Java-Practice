package com.java.rohit;
import java.util.*;
import java.util.Map.Entry;
public class findRepeatChar {

	public static void main(String[] args) {
		String s="Rohit Kumar Sharma";
		String str=s.toLowerCase();
		LinkedHashMap<Character,Integer> hm=new LinkedHashMap<Character, Integer>();
		for(int i=0;i<str.length();i++) {
			if(hm.containsKey(str.charAt(i))) {
				hm.put(str.charAt(i), hm.get(str.charAt(i))+1);
			}
			else {
				hm.put(str.charAt(i), 1);
			}
		}
		for(Entry<Character,Integer> entry:hm.entrySet()) {
			if(entry.getValue()>1) {
				System.out.println(entry.getKey());
			}
		}

	}

}
