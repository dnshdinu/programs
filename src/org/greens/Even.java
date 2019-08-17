package org.greens;

public class Even {

	public static void main(String[] args) {
		int ec=0,oc=0;
		for (int i = 1; i <=100; i++) {
			if (i%2==1) {
				oc=oc+i;
			}
			else {
				
				
				ec=ec+i;
			}
			
		}
		System.out.println(ec);
		System.out.println(oc);
		
	}
}
