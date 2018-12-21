package Muras;
import java.util.Scanner;

//Generator liczb z zakresu start-stop

public class Cw3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
//int start=1;
//int koniec=2;

double start, koniec;

System.err.print("podaj start: ");
Scanner we=new Scanner(System.in);
start= we.nextDouble();

System.err.print("podaj koniec: ");
Scanner we2=new Scanner(System.in);
koniec= we2.nextDouble();

		for (int a=(int) start; a<=koniec; a++) {
			System.out.println(a);		
		}
	}
}