package Tablice;

import java.util.Arrays;

public class Zadanie2 {

	public static void main(String[] args) {
		// tworzenie tablicy z wartoœcimi losowymi
		
		int[] a = new int[10];
		
		for(int i = 0; i < a.length; i++) {
			a[i] = i + 1;
			a[i] = (int) (Math.random() * 10);  //poprzez pomno¿enie przez n (u mnie 10) otrzymujemy
			                                    //losow¹ liczbê z przedzia³u od n do n-1
		}
		System.out.print(Arrays.toString(a));
		
		// odwrócenie tej tablicy:
		System.out.println(" " + " ");
		
		for(int i = 0; i < a.length / 2; i++) {    //odwrócenie tablicy
			int temp = a[i];
			a[i] = a[a.length - 1 - i];
			a[a.length - 1 - i] = temp;
		}
		System.out.println(Arrays.toString(a));
	}

}
