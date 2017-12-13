public abstract class Protagonist extends Character {
	// Protagonist.java:1: error: Protagonist is not abstract and does not override abstract method toString() in Protagonist
  // public class Protagonist extends Character {
  //        ^

	// YoRPG.java:29: error: Protagonist is abstract; cannot be instantiated
  // Protagonist test = new Protagonist("Bob");

	// Warrior.java:1: error: Warrior is not abstract and does not override abstract method toString() in Protagonist
  // public class Warrior extends Protagonist {
  //        ^

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
	public abstract void specialize();

	// Normalizes attack and defense
	public abstract void normalize();

	// toString
	public abstract String toString();

}
