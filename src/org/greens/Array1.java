package org.greens;

public class Array1 {
public static void main(String[] args) {
	int a[]= {10,100,30,40,50,70},temp=0;
	for (int i = 0; i < a.length; i++) {
		
		for (int j = i+1; j < a.length; j++) 
		{
			if (a[i]>a[j]) 
			{
				temp=a[i];
			     a[i]=a[j];
			     a[j]=temp;	
			}	
		}
	}
	for (int k : a) {
		System.out.println(k);	
	}

}
}
