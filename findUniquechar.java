package com.java.rohit;
import java.util.*;
import java.util.Map.Entry;
public class findUniquechar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
	    char[] charr=str.toCharArray();
        HashMap<Character,Integer> hm=new HashMap<Character, Integer>();
        for(int i=0;i<charr.length;i++){
            if(hm.containsKey(charr[i])){
                hm.put(charr[i],hm.get(charr[i])+1);
            }
            else{
                hm.put(charr[i],1);
            }
        }
        for(Entry<Character,Integer> entry:hm.entrySet()) {
	    	if(entry.getValue()==1) {
	    		System.out.println(entry.getKey());
	    		break;
	    	}
	    }

	}

}
