package com.suraj.arrylist;

import java.util.LinkedList;

public class linkedlist1 {
	
	public static void main(String[] args) {
	
		LinkedList ip= new LinkedList();
	
		ip.add("suraj");
		ip.add("amit");
		ip.add(null);
		ip.set(1,"ramavtar" );
		System.out.println(ip);
		ip.add(1, "amit");
	
	
		
	}

}
