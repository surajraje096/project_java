package com.suraj.arrylist;

import java.util.Vector;

public class VectorCunstructor {

public static void main(String[] args) {
	
	Vector ip =new Vector();
	System.out.println(ip.capacity());
	for (int i=1;i<=10;i++ ) {
		ip.addElement(i);
	}
	System.out.println(ip);
	ip.addElement("a");
	System.out.println(ip.capacity());
	System.out.println(ip);	
	
}

}
