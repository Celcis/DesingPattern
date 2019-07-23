package Memento;


public class Transfer {

	
	public static void execute(Konto herkunft, Konto ziel, final int betrag) {
	
		final KontoMemento herkunsfMemento = herkunft.createMemento();
		final KontoMemento zielMemento = ziel.createMemento();
		
		try {
			ziel.update(betrag);
			herkunft.update(-betrag);
		}catch(Exception e) {
			
			herkunft.setMemento(herkunsfMemento);
			ziel.setMemento(zielMemento);
		}
	}




}
