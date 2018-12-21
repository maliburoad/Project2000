package Muras;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Konwerter cale na milimetry

public class Cw2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		final double przelicznik = 25.4;
		int cale = 1;

		BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
		System.err.print("długość[in] =");
		String inch = br.readLine();
		Double in = new Double(inch);
		System.out.println("Cale: " + cale + ". Milimetry: " + in*przelicznik);			

	}

}
