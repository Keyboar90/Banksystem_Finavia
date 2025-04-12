package oop;

import java.time.LocalDate;

import java.time.LocalTime;

import java.util.ArrayList;

public class Konto {

	// 1. Attribute und Eigenschaften. Oberklasse.

	protected double kontoStd;

	protected ArrayList<Transaktion> transaktionen;

	// 2. Konstruktor.

	public Konto(double kontoStd) {

		super();

		this.kontoStd = kontoStd;

		this.transaktionen = new ArrayList<Transaktion>();
	}

	// 3. Getter- und setter-Methoden.

	public double getKontoStd() {

		return kontoStd;

	}

	public void setKontoStd(double kontoStd) {

		this.kontoStd = kontoStd;

	}

	public ArrayList<Transaktion> getTransaktionen() {

		return transaktionen;

	}

	public void setTransaktionen(ArrayList<Transaktion> transaktionen) {

		this.transaktionen = transaktionen;

	}

	// 4. Methode abheben.

	public void abheben(double auszahlungsBetrag) {
		
		kontoStd -= auszahlungsBetrag;
		
		transaktionen.add(new Transaktion(LocalDate.now(), LocalTime.now(), Transaktionstyp.AUSZAHLUNG,
				
				auszahlungsBetrag, kontoStd, "Auszahlung"));
		
	}

	// 5. Methode einzahlen.

	public void einzahlen(double einzahlungsBetrag) {

		kontoStd += einzahlungsBetrag;

		transaktionen.add(new Transaktion(LocalDate.now(), LocalTime.now(), Transaktionstyp.EINZAHLUNG,
				einzahlungsBetrag, kontoStd, "Einzahlung"));

	}

	// 6. Methode erstelleKontoauszug.

	public String erstelleKontoauszug() {

		String str = "";

		for (Transaktion trans : transaktionen) {

			str += trans.toString() + "\n";

		}

		return str;

	}

	// 7. toString-Methode.

	public String toString() {

		String str = "";

		str += "Konto [kontoStd=" + kontoStd + "]";

		return str;

	}

}