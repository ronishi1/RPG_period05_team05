public class Werewolf extends Monster {
	
	public Werewolf() {
		
		HP = 100;
		strength = (int) (Math.random() * 20.0) + 15;
		defense = 10;
		attackR = 1;
	}

	public String toString() {
		return super.toString() + System.lineSeparator() + "Type: Werewolf";
	}

}