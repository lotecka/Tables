package Tablice;

import java.util.Arrays;

public class Zadanie5 {

	public static void main(String[] args) {
		// Zainicjalizuj tablicê dwuwymiarow¹ 3×3, 
		//wype³nij j¹ ca³¹ liczbami i na koniec 
		//wyœwietl sumê wszystkich liczb na ekran konsoli.
		
		int[] [] number = new int[3][3]; 
		
		int [] [] number1 = {
				{1, 2, 3},
				{2, 3, 4},
				{3, 4, 5},
				
		};
		// wypisanie tablicy:
		for(int i = 0; i < number1.length; i++) {
			for(int j = 0; j < number1.length; j++) {
				System.out.print(number1[i][j] + " ");
			}
			System.out.println();
		}
		// suma wszystkich liczb tablicy:
		 int suma = number1[0][0] + number1[0][1] +number1[0][2    ] + 
				 number1[1][0] +number1[1][1] +number1[1][2] +
				 number1[2][0] +number1[2][1] +number1[2][2];

	        System.out.println("Wynik dodawania liczb: "+ suma);
	}

}
