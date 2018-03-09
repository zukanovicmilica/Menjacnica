package menjacnicaInterfejs;

import java.util.GregorianCalendar;

import menjacnica.Kurs;

public interface InterfejsMenjacnice {

	public void dodatiKurs(String nazivValute, Kurs noviKurs);

	public void obrisiKurs(String nazivValute, Kurs kursOdredjenogDana);

	public Kurs vratiKursNaOdredjeniDan(String nazivValute, GregorianCalendar datum);

}
