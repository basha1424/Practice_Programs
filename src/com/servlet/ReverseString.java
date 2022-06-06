package com.servlet;

public class ReverseString {

	public static void main(String[] args) {
		String temp = "";
		String s = "this is my class";
		char[] ar = s.toCharArray();

//		System.out.println("basha");

		for (int i = 0; i < ar.length -1 ; i++) {
			char t = ar[i];
			ar[i] = ar[ar.length - 1];
			ar[ar.length - 1] = t;

		}
		 for (int i = ar.length - 1; i > 0; i--) {
			
		//	for (int i = 0;i < ar.length ; i++) { //
			temp = temp + ar[i];

		}

		System.out.println(ar[0]+temp);
	}

}
