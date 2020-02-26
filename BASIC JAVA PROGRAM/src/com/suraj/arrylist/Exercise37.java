package com.suraj.arrylist;

import java.util.Scanner;

public class Exercise37 {
	public static void main(String[] args) {
		Scanner se = new Scanner(System.in);
		System.out.print("enter string :");
		char [] str=se.nextLine().toCharArray();
		  System.out.print("Reverse string: ");
		for(int i=str.length-1;i>=0;i--) {
			System.out.print(str[i]);
		}
	System.out.print("\n");
		
		
		
		
		
	}

}
