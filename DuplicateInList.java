package com.java.rohit;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateInList {

	public static void main(String[] args) {
		List<Integer> lst=Arrays.asList(1,2,3,4,5,5,6,2,2,5,4);
		//List<Integer> reslst=lst.stream().distinct().collect(Collectors.toList());
 		HashSet<Integer> st=new HashSet<Integer>();
		HashSet<Integer> rsst=(HashSet<Integer>) lst.stream().filter(i->!st.add(i)).collect(Collectors.toSet());
		System.out.println(rsst);
	}

}
