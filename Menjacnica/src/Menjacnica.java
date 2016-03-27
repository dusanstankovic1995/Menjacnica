import java.util.GregorianCalendar;
import java.util.LinkedList;

import menjacnica.Valuta;
import menjacnica.interfejs.MenjacnicaInterfejs;

public class Menjacnica implements MenjacnicaInterfejs {

	LinkedList<Valuta> kursevi = new LinkedList<Valuta>();

	@Override
	public void dodavanjeKursa(GregorianCalendar datum, String naziv, String skraceniNaziv, double prodajniKurs,
			double kupovniKurs, double srednjiKurs) {
		Valuta v = new Valuta();
		v.setDatum(datum);
		v.setNaziv(naziv);
		v.setSkraceniNaziv(skraceniNaziv);
		v.setProdajniKurs(prodajniKurs);
		v.setSrednjiKurs(srednjiKurs);
		v.setKupovniKurs(kupovniKurs);

		kursevi.add(v);

	}

	@Override
	public void brisanjeKursa(GregorianCalendar datum, String naziv, String skraceniNaziv) {
		Valuta v = new Valuta();
		v.setNaziv(naziv);
		v.setSkraceniNaziv(skraceniNaziv);
		v.setDatum(datum);

		for (int i = 0; i < kursevi.size(); i++) {
			if (kursevi.get(i).equals(v)) {

				kursevi.remove(i);

			}
			break;
		}

	}

	@Override
	public double[] pronadjiIVratiKurs(GregorianCalendar datum, String naziv, String skraceniNaziv) {

		double[] kurs = new double[3];

		Valuta v = new Valuta();
		v.setNaziv(naziv);
		v.setSkraceniNaziv(skraceniNaziv);
		v.setDatum(datum);

		for (int i = 0; i < kursevi.size(); i++) {
			if (kursevi.get(i).equals(v)) {
				kurs[0] = kursevi.get(i).getProdajniKurs();
				kurs[1] = kursevi.get(i).getSrednjiKurs();
				kurs[2] = kursevi.get(i).getKupovniKurs();
			}

			break;

		}
		return kurs;

	}
}
