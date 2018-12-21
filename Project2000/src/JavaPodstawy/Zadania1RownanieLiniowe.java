package JavaPodstawy;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Napisz program, który rozwiąże równanie liniowe z jedną niewiadomą x: ax + b = 0.
Program powinien wczytać ze standardowego wejścia współczynniki rzeczywiste a i b (zakładamy, że
a ≠ 0), a potem wyliczyć i wypisać na standardowym wyjściu wartość x.
*/

public class Zadania1RownanieLiniowe {

	static double rownanie(double a, double b) {
		double x= -(b/a);
		return x;
	}
		
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
		System.err.print("Podaj a: ");
		String strA = br.readLine();
		System.err.print("Podaj b: ");
		String strB = br.readLine();
		double a = Double.parseDouble(strA);
		double b = Double.parseDouble(strB);		
		if (a==0) {
			System.out.println("Zmienna a nie może być zerem");
			System.exit(0);
		}
				
		double wynik = rownanie(a, b);
		System.out.println(wynik);

	}
}
