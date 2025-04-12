package oop;

import java.time.LocalDate;

import java.util.ArrayList;

public class Kunde {

	// 1. Attribute und Eigenschaften.

	private String name;

	private String vorname;

	private String kundenID;

	private LocalDate kundeSeit;

	private ArrayList<Konto> konten;

	// 2. Konstruktor.

	public Kunde(String name, String vorname, String kundenID, LocalDate kundeSeit) {

		super();

		this.name = name;

		this.vorname = vorname;

		this.kundenID = kundenID;

		this.kundeSeit = kundeSeit;

		this.konten = new ArrayList<>();

	}

	// 3. Getter- und setter-Methoden.

	public String getName() {

		return name;

	}

	public void setName(String name) {

		this.name = name;

	}

	public String getVorname() {

		return vorname;

	}

	public void setVorname(String vorname) {

		this.vorname = vorname;

	}

	public String getKundenID() {

		return kundenID;

	}

	public void setKundenID(String kundenID) {

		this.kundenID = kundenID;

	}

	public LocalDate getKundeSeit() {

		return kundeSeit;

	}

	public void setKundeSeit(LocalDate kundeSeit) {

		this.kundeSeit = kundeSeit;

	}

	public ArrayList<Konto> getKonten() {

		return konten;

	}

	public void setKonten(ArrayList<Konto> konten) {

		this.konten = konten;

	}

	// 4. Methode addKonto.

	public void addKonto(Konto konto) {

		konten.add(konto);

	}

	// 5. Methode displayKonten.

	public void displayKonten() {

		for (Konto konto : konten) {

			System.out.println(konto);

		}
	}

	// 6. toString-Methode.

	@Override

	public String toString() {

		String str = "";

		str += "Kunde [name=" + name + ", vorname=" + vorname + ", kundenID=" + kundenID + ", kundeSeit=" + kundeSeit
				+ ", konten=" + konten + "]";

		return str;
	}

}