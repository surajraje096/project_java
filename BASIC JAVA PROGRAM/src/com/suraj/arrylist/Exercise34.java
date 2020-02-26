package com.suraj.arrylist;

import java.util.Scanner;

public class Exercise34 {
public static void main(String[] args) {
	Scanner se = new Scanner (System.in);
	System.out.println("input lenght of hexogon	:");
	double s=se.nextDouble();
	System.out.println("the are of hexagon is :"+hexagonArea(s));
	
}
public static double hexagonArea(double s) {
	return ((6*(s*s))/(4*Math.tan(Math.PI/6)));
}
}
