package JavaPodstawy;
import java.util.Scanner;

//   https://pl.wikipedia.org/wiki/Chi%C5%84ski_Nowy_Rok

public class KalendarzChinski {

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
		
		System.out.println("Podaj rok: ");
		Scanner odczyt = new Scanner(System.in);
		int liczba= odczyt.nextInt();
		int rok=liczba-3;
			
int number = (rok%12);
System.out.println(number);
		 
		switch (number) {
		    case 0:
		        System.out.println("swinia");
		        break;
		    case 1:
		        System.out.println("szczur");
		        break;
		    case 2:
		        System.out.println("bawol");
		        break;
		    case 3:
		        System.out.println("tygrys");
		        break;
		    case 4:
		        System.out.println("kroli");
		        break;
		    case 5:
		        System.out.println("smok");
		        break;
		    case 6:
		        System.out.println("waz");
		        break;
		    case 7:
		        System.out.println("kon");
		        break;
		    case 8:
		        System.out.println("owca");
		        break;
		    case 9:
		        System.out.println("malpa");
		        break;
		    case 10:
		        System.out.println("kogut");
		        break;
		    case 11:
		        System.out.println("pies");
		        break;
		   default:   
		   System.out.println("konik polny");
		}		
		
		

	}

}
