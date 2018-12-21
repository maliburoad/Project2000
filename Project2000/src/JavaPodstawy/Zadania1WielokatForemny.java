package JavaPodstawy;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Mała Do bardzo lubi wielokąty foremne. W wolnych chwilach rysuje kolejne figury, po czym dzielnie
mierzy kątomierzem wszystkie kąty. Niestety, narysowanie niektórych wielokątów foremnych
okazuje się bardzo trudne, dlatego Mała Do postanowiła odwrócić procedurę i rysować figurę na
podstawie kątów.
Napisz program, który wczyta ze standardowego liczbę całkowitą n > 2, a potem wyznaczy i wypisze
je na standardowym wyjściu kąt pomiędzy dwoma bokami n-kąta foremnego.
Na przykład:
dla n = 3, kąt pomiędzy bokami wyniesie 60°;
dla n = 4, kąt pomiędzy bokami wyniesie 90°;
dla n = 5, kąt pomiędzy bokami wyniesie 108°.
Kąt ma być mierzony w stopniach. Kąt nie musi być liczbą całkowitą.
*/

public class Zadania1WielokatForemny {
	
	public static void zmierzKat(int ilosc) {
		if (ilosc<3) {
			System.out.println("Tak się nie da");
		}else {
			float kat = ((ilosc - 2)*180)/ilosc;
			System.out.println("Kat wewnętrzny pomiedzy bokami wynosi: " + kat);
		}		
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
		System.err.print("Podaj ilość boków wielokąta foremnego: ");
		String strA = br.readLine();
		int ilosc = Integer.parseInt(strA);
		
		Zadania1WielokatForemny.zmierzKat(ilosc);		

	}
}
