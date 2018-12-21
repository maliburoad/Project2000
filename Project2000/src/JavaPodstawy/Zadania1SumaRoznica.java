package JavaPodstawy;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Napisz program, który wczyta ze standardowego wejścia sumę liczb rzeczywistych a+b i różnicę a-b, a
potem wyznaczy te liczby (a oraz b) i wypisze je na standardowym wyjściu.
*/

public class Zadania1SumaRoznica {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
		System.err.print("Podaj sumę liczb a oraz b: ");
		String strA = br.readLine();
		System.err.print("Podaj różnicę liczb a oraz b: ");
		String strB = br.readLine();
		int sum = Integer.parseInt(strA);
		int diff = Integer.parseInt(strB);
		
		Zadania1SumaRoznica.findNumber(sum, diff);
		}
	
	static void findNumber(int sum, int diff) {
		int a = 0;		
		for (int i=0; i < sum; i++) {
			int b = 0;
			a += 1;
			for (int j=0; j <sum; j++ ) {
				b += 1; 
				if (a+b==sum & a-b==diff) {
					System.out.println("Mała Do mówi, że Twoje liczby to a = " + a + ", b = " + b);					
				}
			}
		} 
				
	}
}
