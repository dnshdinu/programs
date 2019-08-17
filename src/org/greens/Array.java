package org.greens;

import java.util.Set;
import java.util.TreeSet;

public class Array {
	 public static void main(String[] args) {
	int a[]= {10,20,30,10,40,50};
	Set<Integer> s=new TreeSet<>();
	for (int i = 0; i < a.length; i++) {
		
		s.add(a[i]);
		
	}
	System.out.println(s);	 
	}

}
