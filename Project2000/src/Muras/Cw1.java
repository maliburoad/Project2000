package Muras;
import java.util.Scanner;
import static java.lang.Math.sqrt;

//Program do oblicznia pola trojkata

public class Cw1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Program do oblicznia pola trojkata");		
		System.err.print("Podaj trzy boki trojkata: ");
		Scanner we=new Scanner(System.in);
		double a,b,c;		
		a= we.nextDouble();
		b= we.nextDouble();
		c= we.nextDouble();
		double p = (a+b+c)/2;
		double s = sqrt(p*(p-a)*(p-b)*(p-c));
		System.out.println("pole: "+ s);	
	}
}