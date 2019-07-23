package Memento;

public class Konto {

	private int betrag = 0;

	/**
	 * Aktualisiert den aktuellen Kontostand duch Addition mit dem uebergebenen Wet.
	 * Sollte das Konto ns Minus geraten und den Mindestbetrag unterschreiten
	 * 
	 * @param wert Geldbetrag, um den der Kontostand aktualisiert werden soll
	 * @throws NichtGedect, falls Mindest betrag unterschriten wird.
	 */

	public void update(int wert) throws IllegalArgumentException {

		if (betrag + wert < -1000) {
			System.out.println("Error");
		}
		betrag += wert;
	}
	
	public KontoMemento createMemento() {
		return new KontoMemento(betrag);
	}
	public void setMemento(final KontoMemento memento) {
		betrag = memento.getBetrag();
	}
}
