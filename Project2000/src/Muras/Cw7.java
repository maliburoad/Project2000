package Muras;
import java.util.Random;
import java.util.Scanner;

public class Cw7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	       int loterja;
	       Random los = new Random();	       
	       loterja=los.nextInt(101);	       
	       System.out.print("Wylosowano: " + loterja);		

		System.out.println("Podaj swoją liczbę: ");
		Scanner  zKlawiatury = new Scanner(System.in);
		int twojaLiczba= zKlawiatury.nextInt();
		System.out.println(twojaLiczba);
		

	       
	       
	       do {
	    	   

			
	       if (loterja>=twojaLiczba){
	    	   System.out.println("za mało");
		   		System.out.println("Podaj swoją liczbę: ");
				int nowa= zKlawiatury.nextInt();
				twojaLiczba=nowa;
				System.out.println(twojaLiczba);
	       }else {
	    	   System.out.println("za dużo");
	       }
	       
	       }
	       while(loterja==twojaLiczba);		
		

	}

}
