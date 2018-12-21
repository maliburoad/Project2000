package Muras;

//Dwuwymiarowa tabliczka mnożenia

public class Cw4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int a=1; a<11; a++) {
			
			for (int b=1; b<11; b++) {
				String wynik=String.format("%2d",a*b);
				System.out.print(wynik+" ");
			}
			System.out.println();
		}
	}
}
