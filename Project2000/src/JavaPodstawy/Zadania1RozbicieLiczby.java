package JavaPodstawy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Napisz program, który wypisze cyfrę jedności, dziesiątek i setek z zadanej liczby.
Program powinien wczytać ze standardowego wejścia całkowitą c, a potem wyznaczyć i wypisać cyfrę
jedności tej liczby (c mod 10), cyfrę dziesiątek i setek.
Zastosuj w tym programie operację dzielenia całkowitoliczbowego (operator /) oraz reszty z dzielenia
(operator %).
*/

public class Zadania1RozbicieLiczby {
	
	public static void rozbijLiczbe(int liczba) {
		
		int setki = liczba/100;
		int dziesiatki = (liczba%100)/10;
		int jednostki = liczba%10;
		System.out.println(setki);
 		System.out.println(dziesiatki);
 		System.out.println(jednostki);
	}
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
		System.err.print("Podaj liczbę do rozbicia: ");
		String strA = br.readLine();
		int liczba = Integer.parseInt(strA);
		Zadania1RozbicieLiczby.rozbijLiczbe(liczba);		
		
	}
}
