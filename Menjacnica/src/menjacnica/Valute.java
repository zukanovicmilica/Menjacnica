package menjacnica;

import java.util.Arrays;
import java.util.LinkedList;

public class Valute {

	private String nazivValute;
	private String skracenicaValute;
	LinkedList<Kurs> kursevi = new LinkedList<Kurs>();

	public String getNazivValute() {
		return nazivValute;
	}

	public void setNazivValute(String nazivValute) {
		if (nazivValute == null)
			throw new RuntimeException("Morate da upisite naziv valute.");
		this.nazivValute = nazivValute;
	}

	public String getSkracenicaValute() {
		return skracenicaValute;
	}

	public void setSkracenicaValute(String skracenicaValute) {
		if (skracenicaValute == null)
			throw new RuntimeException("Morate da upisite skracenicu valute.");
		this.skracenicaValute = skracenicaValute;
	}

	public LinkedList<Kurs> getKursevi() {
		return kursevi;
	}

	public void setKursevi(LinkedList<Kurs> kursevi) {
		this.kursevi = kursevi;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((kursevi == null) ? 0 : kursevi.hashCode());
		result = prime * result + ((nazivValute == null) ? 0 : nazivValute.hashCode());
		result = prime * result + ((skracenicaValute == null) ? 0 : skracenicaValute.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Valute other = (Valute) obj;
		if (kursevi == null) {
			if (other.kursevi != null)
				return false;
		} else if (!kursevi.equals(other.kursevi))
			return false;
		if (nazivValute == null) {
			if (other.nazivValute != null)
				return false;
		} else if (!nazivValute.equals(other.nazivValute))
			return false;
		if (skracenicaValute == null) {
			if (other.skracenicaValute != null)
				return false;
		} else if (!skracenicaValute.equals(other.skracenicaValute))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Valute [nazivValute=" + nazivValute + ", skracenicaValute=" + skracenicaValute + ", kursevi=" + kursevi
				+ "]";
	}

}
