package oop;

import java.time.LocalDate;

public class Festgeldkonto extends Einlagekonto {

	// 1. Attribute und Eigenschaften. Unterklasse von der ersten Unterklasse
	// Einlagekonto.

	// 2. Konstruktor. Die Enum-Klasse Anlagezeitraum existiert seperat in einer
	// eigenen Klasse.

	public Festgeldkonto(double kontoStd, LocalDate anlagedatum, Anlagezeitraum anlagezeitraum) {

		// 2.1 Verweis zum Konstruktor der ersten Unterklasse Einlagekonto.

		super(kontoStd, anlagedatum);

		switch (anlagezeitraum) {

		case TAGE_90:

			this.faelligkeitsDatum = anlagedatum.plusDays(90);

			break;

		case TAGE_180:

			this.faelligkeitsDatum = anlagedatum.plusDays(180);

			break;

		default:

		}

	}

	// 3. toString-Methode.

	public String toString() {

		String str = "";

		str += "Festgeldkonto: Faelligkeitsdatum: " + faelligkeitsDatum;

		str += " Anlagebetrag: " + kontoStd + " Euro";

		return str;

	}
}