package com.java.rohit;


interface Sample{
public void show(int a, int b);
}

public class LambdaExample {
	
public static void main(String[] args) {
	Sample obj=(int a, int b)->{
	if( b==0){
		System.out.println("Divide by zero");
		}
	else {
		int c=a/b;
		System.out.println("Division Result:"+c);
	}
	};
	obj.show(4,2);
}
}
