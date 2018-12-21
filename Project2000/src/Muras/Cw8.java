package Muras;

//Stworzenie instancji klasy Osoba

public class Cw8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		class Osoba{
			String imie;
			String nazwisko;
			int wiek;
		
			Osoba(String imie, String nazwisko, int wiek){
				this.imie=imie;
				this.nazwisko=nazwisko;
				this.wiek=wiek;
			}
			
		}
		
		Osoba ziomek = new Osoba("Seba","Kowalsky", 30);

		
		System.out.println(ziomek.imie);		

	}

}
