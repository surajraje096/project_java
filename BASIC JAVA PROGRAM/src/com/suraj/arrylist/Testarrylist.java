package com.suraj.arrylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Testarrylist {
	public static void main(String[] args) {
		ArrayList<String>list=new ArrayList<String>();
		list.add("Suraj");
		list.add("Amit");
		list.add("Pranay");
		list.add("Umesh");
		System.out.println(list);
		list.add(2,"Dog");
		
		Iterator<String> itr=list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		

			
		}
		
	}


