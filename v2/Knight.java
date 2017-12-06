public class Knight extends Protagonist {
	
	public Knight(String s) {
		super(s);
		strength = 110;
		defense = 50;
	}
	
	public String toString() {
		return super.toString() + System.lineSeparator() + "Specialized as a Knight!";
	}
	
}