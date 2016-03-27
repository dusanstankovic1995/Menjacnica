package menjacnica.interfejs;

import java.util.GregorianCalendar;

public interface MenjacnicaInterfejs {

	public void dodavanjeKursa(GregorianCalendar datum, String naziv, String skraceniNaziv, double prodajniKurs,
			double kupovniKurs, double srednjiKurs);

	public void brisanjeKursa(GregorianCalendar datum, String naziv, String skraceniNaziv);

	public double[] pronadjiIVratiKurs(GregorianCalendar datum, String naziv, String skraceniNaziv);

}
