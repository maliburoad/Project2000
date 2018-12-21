package Muras;
import java.util.Random;
import java.util.Scanner;

public class Cw6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println("Podaj min: ");
		Scanner  zKlawiatury = new Scanner(System.in);
		int zakresMin= zKlawiatury.nextInt();
		System.out.print(zakresMin);
		
		System.out.println("Podaj max: ");
		int zakresMax= zKlawiatury.nextInt();
		System.out.print(zakresMax);
		
	    int liczbaWylosowana;
	    Random los = new Random();

	       
	    liczbaWylosowana=los.nextInt(zakresMax-zakresMin);
	    System.out.print("Wynik to: " + (liczbaWylosowana+zakresMin));		
		

	}

}
