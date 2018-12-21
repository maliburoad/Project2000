package JavaPodstawy;
import java.util.Scanner;
//rok przestepczy

public class SprawdzanieRokPrzestepny {

	boolean sprawdz(int rok) {
		if (((rok % 4 == 0) && (rok % 100 != 0)) || (rok % 400 == 0)){
			return true;		
			}else {
			return false;	
			}	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Podaj rok: ");
		Scanner odczyt = new Scanner(System.in);
		int rok= odczyt.nextInt();

		SprawdzanieRokPrzestepny obiekt = new SprawdzanieRokPrzestepny();
		
		if (obiekt.sprawdz(2018)){
			System.out.println("Jest przestępny");		
			}else {
			System.out.println("Nie jest przestępny");	
		}		
		
	}
}
