public class Protagonist extends Character {
	
	private String name;
	// Constructor for protagonist
	public Protagonist (String s) {
		name = s;
		HP = 125;
		strength = 100;
		defense = 40;
		attackR = .5;
	}
	// Accessor method for name
	public String getName() {
		return name;
	}
	
	// Raises strength, lowers defense
	public void specialize() { 
		defense -= 10;
		strength += 20;
	}
	
	// Normalizes attack and defense
	public void normalize() {
		defense = 40;
		strength = 100; 
	}
}