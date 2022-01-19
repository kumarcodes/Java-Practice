package com.java.rohit;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
class UsingSet{
	public void usingSet(String[] strarr) {
		Set<String> set=new HashSet<String>();
		for(int i=0;i<strarr.length;i++) {
			if(set.contains(strarr[i])) {
				System.out.println(strarr[i]);
			}
			else {
				set.add(strarr[i]);
			}
	}
	}
}
class UsingHashMap{
	public void usingHashMap(String[] strarr) {
		HashMap<String, Integer> hm=new HashMap<String, Integer>();
		for(int i=0;i<strarr.length;i++) {
			if(hm.containsKey(strarr[i])) {
				hm.put(strarr[i], hm.get(strarr[i])+1);
			}
			else {
				hm.put(strarr[i], 1);
			}
		}
		for(Entry<String, Integer> entry:hm.entrySet()) {
			if(entry.getValue()>1) {
				System.out.println(entry.getKey());
			}
		}
	}
}

public class WordRepetation {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String[] strarr=null;
		UsingHashMap obj=new UsingHashMap();
		UsingSet obj1=new UsingSet();
		strarr=str.split(" ");
		obj.usingHashMap(strarr);
		//obj1.usingSet(strarr);
		
		
//		for(int i=0;i<strarr.length;i++)
//		System.out.println(strarr[i]);
		
	}
}

