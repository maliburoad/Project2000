package JavaPodstawy;
import java.util.Scanner;

public class SprawdzanieCzyLiczbaUjemna {

	
	public static boolean oblicz(int signum) {
		if (signum<0){
			System.out.println("Liczba ujemna");
			return true;
		}else {
			System.out.println("Liczba dodatnia");
			return false;
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Podaj liczbę rzeczywistą: ");
		Scanner odczyt = new Scanner(System.in);
		int signum= odczyt.nextInt();
		
		boolean wynik = oblicz(signum);
		System.out.println(wynik);		
		
	}

}
