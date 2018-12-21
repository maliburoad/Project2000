package Muras;
import java.util.Scanner;

//Napisz program, który sprawdzi czy z podanych trzech liczb oznaczających długości boków można utworzyć trójkąt.

public class Cw10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
   		System.out.println("Podaj trzy boki trójkąta: ");
		Scanner  zKlawiatury = new Scanner(System.in);
		int a= zKlawiatury.nextInt();
		System.out.println(a);
		int b = zKlawiatury.nextInt();
		System.out.println(b);
		int c= zKlawiatury.nextInt();
		System.out.println(c);	
		
	
		int max=0;
		boolean possible = false;
		
		if (a>b&a>c) {
			max=a;
			if(b+c>a) {
				possible=true;	
			}
		}
		if (b>a&b>c) {
			max=b;
			if(a+c>b) {
				possible=true;		
			}
		}
		if (c>a&c>b) {
		max=c;
			if(a+b>c) {
				possible=true;		
			}
		}

		if (possible==true){
			System.out.println("Da sie");
		}else {
			System.out.println("Nie da sie");
		}
		
		System.out.println(max);		
		
		
	}

}
