package menjacnica;

import java.util.GregorianCalendar;
import java.util.LinkedList;

import menjacnicaInterfejs.InterfejsMenjacnice;

public class Menjacnica implements InterfejsMenjacnice {

	@Override
	public void dodatiKurs(String nazivValute, Kurs noviKurs) {
	}

	@Override
	public void obrisiKurs(String nazivValute, Kurs kursOdredjenogDana) {
	}

	@Override
	public Kurs vratiKursNaOdredjeniDan(String nazivValute, GregorianCalendar datum) {
		return null;
	}

}
