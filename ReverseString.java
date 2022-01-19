package com.java.rohit;
import java.util.Scanner;
class Solution {
    public void reverseString(char[] s) {
        char temp;
        int n=s.length;
        for(int i=0;i<s.length;i++){
           temp= s[i];
            s[i]=s[n-i-1];
            s[n-i-1]=temp;
        }
       
        
        for(int i=0;i<s.length;i++){
        System.out.print(s[i]);
        }
        
    }
}
public class ReverseString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		char[] c=str.toCharArray();
		Solution obj=new Solution();
		obj.reverseString(c);

	}

}
