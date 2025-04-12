package oop;

import java.time.LocalDate;

import java.time.LocalTime;

import java.util.ArrayList;

public class Kundenreport {

	public static void main(String[] args) {

		// Wiederholung aus dem Übungsblatt 11) Aufgabe 4) und
		// Vorbereitung auf den 3. Meilenstein. Bearbeitet am: 19.02.2024.

		System.out.println(
				"======================= Willkommen beim Banken- und Finanzsystem Finavia von Lukas Völzing =======================");

		LocalTime currentTime = LocalTime.now();

		System.out.println("\nAktuelle Uhrzeit: " + currentTime);

		// 1. Arraylist erstellen.

		ArrayList<Kunde> kunden = new ArrayList<>();

		// 2. Girokonto trumpfkonto erstellen.

		Girokonto trumpfkonto = new Girokonto(1500.0, 1000);

		Kunde trumpf = new Kunde("Trumpf", "Dagobert", "4711", LocalDate.now());

		trumpf.addKonto(trumpfkonto);

		kunden.add(trumpf);

		// 1. Zwischenausgabe.

		report(kunden);

		System.out.println("\nKontoauszug:");

		System.out.println(trumpfkonto.erstelleKontoauszug());

		// 2. Zwischenausgabe.

		System.out.println("Einzahlung von 20 Euro.");

		trumpfkonto.einzahlen(20.0);

		System.out.println("Einzahlung von 50 Euro.");

		trumpfkonto.einzahlen(50.0);

		System.out.println("Einzahlung von 100 Euro.");

		trumpfkonto.einzahlen(100.0);

		// 2. Zwischenausgabe.

		report(kunden);

		System.out.println("\nKontoauszug:\n");

		System.out.println(trumpfkonto.erstelleKontoauszug());

		System.out.println("Abhebung von 10 Euro.");

		trumpfkonto.abheben(10.0);

		System.out.println("Abhebung von 5 Euro.");

		trumpfkonto.abheben(5.0);

		System.out.println("Abhebung von 20 Euro.");

		trumpfkonto.abheben(20.0);

		// 3. Zwischenausgabe.

		report(kunden);

		System.out.println("\nKontoauszug:");

		System.out.println(trumpfkonto.erstelleKontoauszug());

	}

	public static void report(ArrayList<Kunde> kunden) {

		System.out.println("\nKUNDENREPORT:\n");

		for (Kunde kunde : kunden) {

			System.out.println("Kunde: " + kunde.getName() + ", " + kunde.getVorname());

			ArrayList<Konto> konten = kunde.getKonten();

			for (Konto konto : konten) {

				if (konto instanceof Einlagekonto) {

					System.out.println("    " + konto);

				}
			}

			for (Konto konto : konten) {

				if (konto instanceof Girokonto) {

					System.out.println("    " + konto);

				}
			}
		}
	}
}