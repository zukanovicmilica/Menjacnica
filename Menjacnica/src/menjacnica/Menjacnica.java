package menjacnica;

import java.util.GregorianCalendar;
import java.util.LinkedList;

import menjacnicaInterfejs.InterfejsMenjacnice;

public class Menjacnica implements InterfejsMenjacnice {
	LinkedList<Valute> kursnaLista = new LinkedList<Valute>();

	@Override
	public void dodatiKurs(String nazivValute, Kurs noviKurs) {
		for (int i = 0; i < kursnaLista.size(); i++) {
			if (kursnaLista.get(i).getNazivValute().contains(nazivValute)) {
				kursnaLista.get(i).kursevi.add(noviKurs);
			}
		}
	}

	@Override
	public void obrisiKurs(String nazivValute, Kurs kursOdredjenogDana) {
		for (int i = 0; i < kursnaLista.size(); i++) {
			if (kursnaLista.get(i).getNazivValute().contains(nazivValute))
				kursnaLista.get(i).kursevi.remove(kursOdredjenogDana);
		}
	}

	@Override
	public Kurs vratiKursNaOdredjeniDan(String nazivValute, GregorianCalendar datum) {
		for (int i = 0; i < kursnaLista.size(); i++) {
			if (kursnaLista.get(i).getNazivValute().contains(nazivValute))
				for (int j = 0; j < kursnaLista.get(i).kursevi.size(); j++)
					if (kursnaLista.get(i).kursevi.get(j).getDatum().compareTo(datum) == 0)
						return kursnaLista.get(i).kursevi.get(j);
		}
		return null;
	}

}
