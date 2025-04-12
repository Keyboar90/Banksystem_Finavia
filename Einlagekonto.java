package oop;

import java.time.LocalDate;

public class Einlagekonto extends Konto {

	// 1. Attribute und Eigenschaften. Unterklasse.

	protected double kontoStd;

	protected LocalDate anlageDatum;

	protected LocalDate faelligkeitsDatum;

	// 2. Konstruktor.

	public Einlagekonto(double kontoStd, LocalDate anlageDatum) {

		super(kontoStd);

		this.anlageDatum = anlageDatum;

		this.faelligkeitsDatum = null;

	}

	public Einlagekonto(double kontoStd, LocalDate anlageDatum, LocalDate faelligkeitsDatum) {

		super(kontoStd);

		this.anlageDatum = anlageDatum;

		this.faelligkeitsDatum = faelligkeitsDatum;

	}

	// 3. Getter- und setter-Methoden.

	public double getKontoStd() {

		return kontoStd;

	}

	public void setKontoStd(double kontoStd) {

		this.kontoStd = kontoStd;

	}

	public LocalDate getAnlageDatum() {

		return anlageDatum;

	}

	public void setAnlageDatum(LocalDate anlageDatum) {

		this.anlageDatum = anlageDatum;

	}

	public LocalDate getFaelligkeitsDatum() {

		return faelligkeitsDatum;

	}

	public void setFaelligkeitsDatum(LocalDate faelligkeitsDatum) {

		this.faelligkeitsDatum = faelligkeitsDatum;

	}

	// 4. Methoden abheben.

	public void abheben(double auszahlungsBetrag) {

		if (!LocalDate.now().isBefore(faelligkeitsDatum)) {

			kontoStd -= auszahlungsBetrag;

		} else {

			System.out.println("\nFehler aufgetreten!");
		}

	}

	// 5. toString-Methode.

	@Override

	public String toString() {

		String str = "";

		str += "Einlagekonto [kontoStd=" + kontoStd + ", anlageDatum=" + anlageDatum + ", faelligkeitsDatum="
				+ faelligkeitsDatum + super.toString() + "]";

		return str;
	}

}