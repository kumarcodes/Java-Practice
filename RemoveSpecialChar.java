package com.java.rohit;

import java.util.Scanner;

public class RemoveSpecialChar {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		str=str.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(str);

	}

}
