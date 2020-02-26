package com.suraj.arrylist;

import java.util.Scanner;

public class Exercise32 {
	public static void main(String[] args) {
		Scanner se = new Scanner(System.in);
		System.out.println("enter 1 number=");
		int a = se.nextInt();
		System.out.println("enter 2nd number=");
		int b = se.nextInt();
		if (b == a) {
			System.out.printf("%d==%d\n", a, b);
		}
		if (b != a) {
			System.out.printf("%d!==%d\n", a, b);
		}
		if(a<b) {
			System.out.printf("%d<a%\n",a,b);
		}
	}

}
