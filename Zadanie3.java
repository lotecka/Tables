package Tablice;

import java.util.Arrays;
import java.util.Scanner;

public class Zadanie3 {

	public static void main(String[] args) {
		//Stw�rz tablic� na 3 imiona, kt�r� wype�nisz imionami 
		//podanymi przez u�ytkownika. Na koniec wy�wietl je wszystkie.
		
		String[] imiona = new String[3];
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Podaj pierwsze imie: ");
	    imiona[0] = sc.next();
	    
	    System.out.println("Podaj drugie imie: ");
	    imiona[1] = sc.next();
	    
	    System.out.println("Podaj trzecie imie: ");
	    imiona[2] = sc.next();
	    
	    System.out.println(Arrays.toString(imiona));
	    System.out.println("Imiona: " + imiona[0] + " " + imiona[1] + " " + imiona[2]);
	    

}
}
