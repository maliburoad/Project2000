package JavaPodstawy;

import java.util.*;

class Kalendarz {
    private int dz, mc, rk;

    private static int[][] dni = {
            {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},
            {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}
    };
    private static String[] mce = {"",
            "stycznia", "lutego", "marca",
            "kwietnia", "maja", "czerwca",
            "lipca", "sierpnia", "września",
            "października", "listopada", "grudnia"
    };
    public static final String[] tydzien = {
            "niedziela", "poniedziałek", "wtorek",
            "środa", "czwartek", "piątek", "sobota"
    };
    private static int przest(int r) {
        return (r % 4 == 0) && (r %100 != 0) || (r % 400 == 0) ? 1 : 0;
    }
    private static int iledni(Kalendarz d) {
        int r = d.rk - 1;
        int suma = 365 * r + r / 4 - r / 100 + r / 400;
        for (int i = 1; i < d.mc; i++) suma += dni[przest(d.rk)][i];
        suma += d.dz;
        return suma;
    }

    public Kalendarz() {
        GregorianCalendar k = new GregorianCalendar();
        dz = k.get(Calendar.DAY_OF_MONTH);
        mc = k.get(Calendar.MONTH) + 1;
        rk = k.get(Calendar.YEAR);
    }
    public Kalendarz(int d, int m, int r) {
        if (r < 1) throw new IllegalArgumentException("rok spoza zakresu");
        if (m < 1 || m > 12) throw new IllegalArgumentException("miesiąc spoza zakresu");
        if (d < 1 || d > dni[przest(r)][m]) throw new IllegalArgumentException("dzień spoza zakresu");
        dz = d;
        mc = m;
        rk = r;
    }

    public String toString() {
        return String.format("%s %d %s %d", tydzien[iledni(this) % 7], dz, mce[mc], rk);
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Kalendarz d = new Kalendarz(17,12,2018);
		System.out.println(d);
	}	
}