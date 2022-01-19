package com.java.rohit;
import java.util.*;
import java.util.Map.Entry;
public class HashMapExample {

	public static void main(String[] args) {
		int arr[]={10,12,15,10,2,2,3,4,3,5,4,6,2};
	    Map<Integer,Integer> hm=new HashMap<Integer,Integer>();
	    for(int i=0;i<arr.length;i++){
	    	if(hm.containsKey(arr[i])) {
	    		hm.put(arr[i],hm.get(arr[i])+1);
	    	}
	    	else {
	    		hm.put(arr[i], 1);
	    	}
	    }
	    
	    for(Entry<Integer,Integer> entry:hm.entrySet()) {
	    	if(entry.getValue()==1) {
	    		System.out.println(entry.getKey());
	    	}
	    }
	    }

	}

