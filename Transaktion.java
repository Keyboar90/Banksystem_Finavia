package oop;

import java.time.LocalDate;

import java.time.LocalTime;

import java.time.format.DateTimeFormatter;

public class Transaktion {

	// 1. Attribute und Eigenschaften.

	private LocalDate datum;

	private LocalTime zeit;

	private Transaktionstyp typ;

	private double betrag;

	private double kontoStdNeu;

	private String beschreibung;

	// 2. Konstruktor.

	public Transaktion(LocalDate datum, LocalTime zeit, Transaktionstyp typ, double betrag, double kontoStdNeu,
			String beschreibung) {

		super();

		this.datum = datum;

		this.zeit = zeit;

		this.typ = typ;

		this.betrag = betrag;

		this.kontoStdNeu = kontoStdNeu;

		this.beschreibung = beschreibung;

	}

	// 3. Getter- und setter-Methoden.

	public LocalDate getDatum() {

		return datum;

	}

	public void setDatum(LocalDate datum) {

		this.datum = datum;

	}

	public LocalTime getZeit() {

		return zeit;

	}

	public void setZeit(LocalTime zeit) {

		this.zeit = zeit;

	}

	public Transaktionstyp getTyp() {

		return typ;

	}

	public void setTyp(Transaktionstyp typ) {

		this.typ = typ;

	}

	public double getBetrag() {

		return betrag;

	}

	public void setBetrag(double betrag) {

		this.betrag = betrag;

	}

	public double getKontoStdNeu() {

		return kontoStdNeu;

	}

	public void setKontoStdNeu(double kontoStdNeu) {

		this.kontoStdNeu = kontoStdNeu;

	}

	public String getBeschreibung() {

		return beschreibung;

	}

	public void setBeschreibung(String beschreibung) {

		this.beschreibung = beschreibung;

	}

	// 4. toString-Methode.

	@Override

	public String toString() {

		String str = "";

		str += "Transaktion [Datum=" + datum + ", Zeit=";

		str += zeit.format(DateTimeFormatter.ofPattern("HH:mm:ss")) + ", Typ=" + typ;

		str += ", Betrag=" + betrag + " Euro, neuer Kontostand=" + kontoStdNeu;

		str += " Euro, Beschreibung=" + beschreibung + "]";

		return str;

	}

}