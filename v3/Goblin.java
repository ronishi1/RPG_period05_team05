public class Goblin extends Monster {
	
	public Goblin() {
		
		HP = 50;
		strength = (int) (Math.random() * 10.0) + 5;
		defense = 5;
		attackR = 1;
	}

	public String toString() {
		return super.toString() + System.lineSeparator() + "Type: Goblin";
	}

}