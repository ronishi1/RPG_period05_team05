public class Monster extends Character {
	
	public Monster() {
		HP = 150;
		strength = (int) (Math.random() * 45.0) + 20;
		defense = 20;
		attackR = 1;
	}
}