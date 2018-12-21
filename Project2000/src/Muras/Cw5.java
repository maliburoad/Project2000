package Muras;
import java.util.Random;

public class Cw5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	       int liczbaWylosowana;
	       Random los = new Random();

	       do {
	           liczbaWylosowana=los.nextInt(20);
	           System.out.print(liczbaWylosowana+" ");
	       }
	           while(liczbaWylosowana!=10);		

	}

}
