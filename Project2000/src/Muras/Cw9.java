package Muras;
import java.util.Scanner;

//Napisz program, który wczyta trzy liczby, następnie wyświetli je w kolejności od najmniejszej do największej

public class Cw9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
   		System.out.println("Podaj trzy liczby do posortowania: ");
		Scanner  zKlawiatury = new Scanner(System.in);
		int a= zKlawiatury.nextInt();
		System.out.println(a);
		int b = zKlawiatury.nextInt();
		System.out.println(b);
		int c= zKlawiatury.nextInt();
		System.out.println(c);

int min=0;
		
		
		if (a<c && a<b){
			min=a;
		}
	
		
		if (b<a && b<c){
			min=a;
		}
		
		if (c<a && c<b){
			min=a;
		}
	System.out.println(min);		
		

	}

}
