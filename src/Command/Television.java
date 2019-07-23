package Command;

public class Television implements ElectronicDevice {

	private int volume = 0;

	@Override
	public void on() {
		System.out.println("Television is ON !");
	}

	@Override
	public void off() {
		System.out.println("Television is OFF !");

	}

	@Override
	public void volumeUp() {
		volume++;
		System.out.println("Volume is going UP : "+ volume);
	}

	@Override
	public void volumeDown() {
		volume--;
		System.out.println("Volume is going down !"+ volume);
	}

}
