public class Defender extends Protagonist {

	public Defender(String s) {
		super(s);
		defense = 60;
	}
	
	public String toString() {
		return super.toString() + System.lineSeparator() + "Specialized as a Defender!";
	}
}