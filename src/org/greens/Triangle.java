package org.greens;

public class Triangle {

	
	public static void main(String[] args) {
	for (int i = 1; i <=5; i++) {
		for (int j = 1; j <=5-i; j++) {
			
			System.out.print(i+" ");
		}
		for (int k = 0; k <= i; k++) {
			System.out.print(" ");	
		}
		System.out.println();
	}
	}
}