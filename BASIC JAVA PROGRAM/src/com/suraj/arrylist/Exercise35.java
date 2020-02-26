package com.suraj.arrylist;

import java.util.Scanner;

public class Exercise35 {
	public static void main(String[] args) {
		Scanner se= new Scanner (System.in);
		System.out.println("enter side:");
		int ns= se.nextInt();
		System.out.println("enter lenght:");
		double side =se.nextDouble();
		System.out.println("the are lenght :"+poligonarea(ns, side)+"\n");
	}
	public static double poligonarea(int ns, double side) {
		return (ns*(side*side))/(4.0*Math.tan(Math.PI/ns));
	}

}
