package com.suraj.arrylist;

import java.util.ArrayList;

public class Arrynew {
	public static void main(String[] args) {
		
		ArrayList<Integer>first=new ArrayList<>();
		
		first.add(2);
		first.add(3);
		first.add(4);
		
		ArrayList<Integer>last= new ArrayList<Integer>();
		last.add(5);
		last.add(6);
		last.add(7);
		
		last.addAll(first);
		System.out.println(last);
		
		
		
	}

}
