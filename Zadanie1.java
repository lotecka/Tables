package Tablice;

import java.util.Arrays;

public class Zadanie1 {

	public static void main(String[] args) {
		// Wypisanie tablicy oraz jej odwrotnoœci.:
		
		int[] a = new int[10];
		
		for(int i = 0; i < 10; i++) {  
			a[i] = i + 1;
		}
			System.out.print(Arrays.toString(a));   //wypisuje tablicê juz z przecinkami i nawiasami kwadratowymi
			
			
			System.out.println();
		System.out.println("----------");
		
		 for(int i = 0; i < a.length / 2; i++) {
			 int temp = a[i];
			 a[i] = a[a.length - 1 - i];
			 a[a.length- 1 - i] = temp;
			 }
		 System.out.print(Arrays.toString(a));

	}

}
