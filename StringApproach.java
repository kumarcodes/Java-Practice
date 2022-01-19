package com.java.rohit;

public class StringApproach {

	public static void main(String[] args) {
		int arr[]={10,12,15,10,2,2,3,4,3,5,4,6,2};
		String str="";
		for(int i=0;i<arr.length;i++) {
			str=str+arr[i];
		}
		
		System.out.println(str);
	}

}
