package oop;

public class Girokonto extends Konto {

	// 1. Attribute und Eigenschaften. Unterklasse.

	private double dispoLimit = 0.0;

	// 2. Konstruktor.

	public Girokonto(double kontoStd, double dispoLimit) {

		super(kontoStd);

		this.dispoLimit = dispoLimit;

	}

	// 3. Methode abheben.

	@Override

	public void abheben(double auszahlungsBetrag) {

		if (kontoStd - auszahlungsBetrag >= 0 || kontoStd - auszahlungsBetrag >= -dispoLimit) {

			kontoStd -= auszahlungsBetrag;
		}

	}

	// 4. toString-Methode.

	@Override

	public String toString() {

		String str = "";

		str += "Girokonto: dispoLimit=" + dispoLimit + " Euro, kontoStd=" + kontoStd + " Euro";

		return str;

	}

}