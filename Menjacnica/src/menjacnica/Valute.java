package menjacnica;

public class Valute {

	private String nazivValute;
	private String skracenicaValute;
	private Kurs[] kursevi;

	public String getNazivValute() {
		return nazivValute;
	}

	public void setNazivValute(String nazivValute) {
		this.nazivValute = nazivValute;
	}

	public String getSkracenicaValute() {
		return skracenicaValute;
	}

	public void setSkracenicaValute(String skracenicaValute) {
		this.skracenicaValute = skracenicaValute;
	}

	public Kurs[] getKursevi() {
		return kursevi;
	}

	public void setKursevi(Kurs[] kursevi) {
		this.kursevi = kursevi;
	}

}
