package Tablice;

import java.util.Scanner;

public class Zadanie6 {

	public static void main(String[] args) {
		// 1.Oblicz sumê liczb: 12, 532, 43, 231, 6, 534, 329, 23 
		//   przy u¿yciu tablicy oraz pêtli

		int[] number = {12, 532, 43, 231, 6, 534, 329, 23};
		int suma = 0;
		
		for(int i : number) {
			suma += i;	
		}
		System.out.println(suma);	
		
			// 2.Oblicz ile jest liczb w parzystych w zbiorze liczb: 
	       //     12, 67, 58, 49, 44, 21, 23, 22, 44, 59, 40. 
	       //   U¿yj tablicy oraz pêtli.
		
		int[] numbers = {12, 67, 58, 49, 44, 21, 23, 22, 44, 59, 40};
		int s = 0;
		
		for(int i = 0; i < numbers.length; i++) {
			if(i % 2 == 0) {
				s += 1;      // ile parzytsych!
			}	
	}
		System.out.println(s);
	
		
		// 3.Oblicz wynik mno¿enia wszystkich liczb: 
		//    12, 2, 15, 9, 11, 8, 15. 
		//   U¿yj pêtli oraz tablicy
		
		int[] mnozenie = {12, 2, 15, 9, 11, 8, 15};
		int iloczyn = 1;
		
		for(int i : mnozenie) {
			iloczyn *= i;
		}
	System.out.println(iloczyn);

	    //4. Maj¹c tablicê 32, 21, 0, 1, 23, 12, 42, 55, 13, 5  
	//  znajdŸ jej najwiêksz¹ i najmniejsz¹ wartoœæ 
	//i wypisz je na ekran konsoli.
	
	int[] number1 = {32, 21, 0, 1, 23, 12, 42, 55, 13, 5};	 
	
	int max = Integer.MIN_VALUE;  //bierzemy najmniejsz¹ mo¿liw¹ wartoœæ jak¹ mo¿na zapisaæ na int
	int min = Integer.MAX_VALUE;
	
	for(int i : number1) {
		if(max < i) {
			max = i;
			}
		if(min > i) {
			min = i;
		}
	} 
	System.out.println(max);  
	System.out.println(min);
	
	// 5. Stwórz tablicê dwuwymiarow¹ o rozmiarze 3×3 
	//  pozwól u¿ytkownikowi na wype³nienie jej ka¿dej komórki. 
	//  Po wype³nieniu ca³ej tablicy wypisz wszystkie elementy tablicy na ekran 
	//    – wiersz pod wierszem.
	
	int[] [] tablica = new int[3] [3];
	
	Scanner sc = new Scanner(System.in);
	
	for(int i = 0; i < tablica.length; i++) {
		for(int j = 0; j < tablica.length; j++) {
			System.out.println("Podaj liczbê dla indeksów: [" + i + "][" + j + "]:");
			tablica[i][j] = sc.nextInt();
		}
		
	}
	System.out.println("Tablica 3x3: ");
	
	for(int i = 0; i < tablica.length; i++) {
		for(int j = 0; j < tablica.length; j++) {
			System.out.print(tablica[i][j] + " ");
		}
		System.out.println();
	} 
	
	int suma1 = 0;
	for(int i = 0; i < tablica.length; i++) {
		for(int j = 0; j < tablica.length; j++) {
			suma1 = tablica[0][0] + tablica[0][1] + tablica[0][2];
		}
	}System.out.println("Suma wiersza wynosi: " + suma1);
}
}




