public class Warrior extends Protagonist {

	public Warrior(String s) {
		super(s);
		strength = 120;
	}

	public String toString() {
		return super.toString() + System.lineSeparator() + "Specialized as a Warrior!";
	}
	
}